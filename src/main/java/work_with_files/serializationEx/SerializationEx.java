package work_with_files.serializationEx;

import java.io.*;

public class SerializationEx {
    public static void main(String[] args) {
        Car car=new Car("Porshe Cayenne", 610);
        Employee employee=new Employee("Iskander", 21, 300000, "IT", car);

        try (ObjectOutputStream objectOutputStream=new ObjectOutputStream
                (new FileOutputStream("/home/iskander/testFiles/employee.bin"))){
            objectOutputStream.writeObject(employee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Thread thread=new Thread(new OtherProgrammist());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done!");
    }
}
