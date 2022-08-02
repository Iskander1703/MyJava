package Lambda.Function;

import Lambda.LambdaEx1.Student;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Lambda.LambdaEx1.Student st1=new Lambda.LambdaEx1.Student("Iskander", 'm', 21, 4, 3.33);
        Lambda.LambdaEx1.Student st2=new Lambda.LambdaEx1.Student("Roma", 'm', 21, 4, 4.21);
        Lambda.LambdaEx1.Student st3=new Lambda.LambdaEx1.Student("Masha", 'f', 18, 1, 4.7);
        Lambda.LambdaEx1.Student st4=new Lambda.LambdaEx1.Student("Dasha", 'f', 21, 3, 4.6);
        Lambda.LambdaEx1.Student st5=new Lambda.LambdaEx1.Student("Nikita", 'm', 18, 1, 5.00);

        ArrayList<Student> studentArrayList=new ArrayList<>();


        studentArrayList.add(st1);
        studentArrayList.add(st2);
        studentArrayList.add(st3);
        studentArrayList.add(st4);
        studentArrayList.add(st5);

        Function<Student, Double> studentDoubleFunction=a->a.avgGrade;
        avg(studentArrayList, studentDoubleFunction);



    }

    public static void avg(ArrayList<Student> arrayList, Function<Student, Double> function){
        AtomicReference<Double> a= new AtomicReference<>(0.0);
        arrayList.forEach(s-> a.updateAndGet(v -> v + s.avgGrade));
        System.out.println(a);
       a.updateAndGet(p->p/arrayList.size());
        System.out.println(a);
    }


}
