package comparation.Test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Ivan", "Tropin",22,150000);
        Employee employee2=new Employee(2,"Iskander", "Tabaev",21,130000);
        Employee employee3=new Employee(3,"Maxim", "Goglazin",20,180000);
        Employee employee4=new Employee(4,"Alexander", "Pustinskii",21,80000);
        Employee employee5=new Employee(5,"Roman", "Stepanov",21,90000);
        Employee employee6=new Employee(6,"Alexander", "Khmara",21,120000);
        Employee employee7=new Employee(7,"Konstantin", "Bondarenko",21,140000);
        Employee employee8=new Employee(8,"Mikhail", "Shelginskih",20,85000);
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);
        employeeArrayList.add(employee6);
        employeeArrayList.add(employee7);
        employeeArrayList.add(employee8);
//        System.out.println("До сортировки:");
//        for (Employee a: employeeArrayList){
//            System.out.println(a.toString());
//        }
//        Collections.sort(employeeArrayList);
//        System.out.println();
//        System.out.println("После сортировки:");
//        for (Employee a: employeeArrayList){
//            System.out.println(a.toString());
//        }

        System.out.println("До сортировки:");
        for (Employee a: employeeArrayList){
            System.out.println(a.toString());
        }
        Collections.sort(employeeArrayList, new Test2.nameComparator());
        System.out.println();
        System.out.println("После сортировки:");
        for (Employee a: employeeArrayList){
            System.out.println(a.toString());
        }
        System.out.println();

        System.out.println("До сортировки:");
        for (Employee a: employeeArrayList){
            System.out.println(a.toString());
        }

        Collections.sort(employeeArrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return employee.getId()-t1.getId();
            }
        });
        System.out.println();
        System.out.println("После сортировки:");
        for (Employee a: employeeArrayList){
            System.out.println(a.toString());
        }

    }

    public static class salaryComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee employee, Employee t1) {
            return employee.getSalary()-t1.getSalary();
        }
    }

    public static class nameComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee employee, Employee t1) {
            int result= employee.getName().compareTo(t1.getName());
            if(result==0){
                result=employee.getSurname().compareTo(t1.getSurname());
            }

            return result;
        }
}
}
