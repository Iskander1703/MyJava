package Generics;

public class ParametriziedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair=new Pair<>(new String("aboba"), 8);
        System.out.println("Сейчас в этой комнате "+ pair.getV2()+" "+pair.getV1());

    }
}

class Pair <V1, V2>{
    private  V1 v1;
    private V2 v2;

    public Pair(V1 v1, V2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public V1 getV1() {
        return v1;
    }

    public V2 getV2() {
        return v2;
    }
}
