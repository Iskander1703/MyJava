package work_with_files.serializationEx;

import java.io.*;

public class OtherProgrammist extends Thread{
    public void run(){
      try  ( ObjectInputStream objectInputStream=
                     new ObjectInputStream(new FileInputStream
                             ("/home/iskander/testFiles/employee.bin")) ) {
          Employee employee=(Employee)  objectInputStream.readObject();
          System.out.println(employee);
      } catch (FileNotFoundException e) {
          throw new RuntimeException(e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }
    }
    }
