package Stream.flatMap;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class Faculty {

    private String name;
    private ArrayList<Student> studentArrayList=new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "studentArrayList=" + studentArrayList +
                '}';
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public String getName() {
        return name;
    }

    public void addNewStudent(Student student){
        studentArrayList.add(student);
    }

}
