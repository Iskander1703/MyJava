package Generics;

public class ParametriziedClass {
    public static void main(String[] args) {
        Info<String> info1=new Info<>(new String("Спартак!"));
        System.out.println(info1.toString());
        String string =info1.getValue();
        Integer integer=8;
        Info<Integer> integerInfo=new Info<>(integer);
        System.out.println(integerInfo.toString());
        Integer stringi=integerInfo.getValue();
    }

}

class  Info <T>{
    private T value;
    public Info(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}