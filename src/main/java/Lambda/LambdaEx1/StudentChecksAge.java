package Lambda.LambdaEx1;

public class StudentChecksAge implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.age>20;
    }
}
