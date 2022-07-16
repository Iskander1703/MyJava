package memory.StackEx;

public class Solution {
    public static int count=0;
    public static int count10=0;
    public static void main(String[] args) {

        try {
            test0();
        }
        catch (StackOverflowError stackOverflowError){
            System.out.println(count);
        }

        try {
            test10();
        }
        catch (StackOverflowError stackOverflowError){
            System.out.println(count10);
        }

    }

    private static void test0(){
        count++;
        test0();
    }

    private static void test10(){
       Long L0=0L;
        Long L1=0L;
        Long L2=0L;
        Long L3=0L;
        Long L4=0L;
        Long L5=0L;
        Long L6=0L;
        Long L7=0L;
        Long L8=0L;
        Long L9=0L;
        count10++;
        test10();
    }


}
