package comparation.Test2;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String surname;
    private int age;
    private int salary;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String name, String surname, int age, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return employee.salary-this.salary;
    }
}
