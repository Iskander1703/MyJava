package work_with_files.serializationEx;

import java.io.Serializable;

public class Employee implements Serializable {

    static final long serialVersionUID=1;
    private String name;
    private int age;
  transient   private double salary;
    private String department;

    private Car car;

    public Employee(String name, int age, double salary, String department, Car car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", car=" + car   +
                '}';
    }
}
