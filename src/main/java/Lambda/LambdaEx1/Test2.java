package Lambda.LambdaEx1;

public class Test2 {
    public static void def (I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        def(s->{return s.length();});

        I i=s->s.length()+5;
        System.out.println(i.abc("Among Us"));

        ReverseStringBuilder reverseStringBuilder=s->s.reverse();
        System.out.println(reverseStringBuilder.reverse(new StringBuilder("Among Us")));
    }
}


 interface I{
 int abc(String s);
}

interface ReverseStringBuilder{
    StringBuilder reverse(StringBuilder stringBuilder);
}