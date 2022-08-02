package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
         String s1="ABCD ABCDEF ABCFABCGABCH";
         //abc - последовательность символов
        Pattern pattern1=Pattern.compile("ABCD");
        Matcher matcher=pattern1.matcher(s1);

        //[abc] - любой символ из перечисленных
        Pattern pattern2=Pattern.compile("[ABCD]");
        Matcher matcher2=pattern2.matcher(s1);

        //[A-Z] - любой символ из промежутка
        String s2="ZXC SDLKWEPO ZXB";
        Pattern pattern3=Pattern.compile("ZX[A-C]");
        Matcher matcher3=pattern3.matcher(s2);

        //[B-Fd-j3-8] - миксуем диапазоны
        //[^B-Fd-j3-8] - миксуем диапазоны - символ ^ значит отрицание
        String s3="aXBDSZLKFKPWSd?!.)(18XA;%$nfscX8H18XAX7ZD8SDKLFdks fZlkskj_8ZdslXzXdmskfl92XZ18XA";
        Pattern pattern4=Pattern.compile("[a-zA-Z]X[A-C1-8a-z]");
        Matcher matcher4=pattern4.matcher(s3);

        //[^B-Fd-j3-8] - миксуем диапазоны - символ ^ значит отрицание
        Pattern pattern5=Pattern.compile("[a-zA-Z][^X][A-C1-8a-z]");
        Matcher matcher5=pattern5.matcher(s3);

        //[a || b] - символ a или b
        Pattern pattern6=Pattern.compile("[a-zA-Z][X|a-z][A-C1-8a-z]");
        Matcher matcher6=pattern6.matcher(s3);

        //. - любой символ
        Pattern pattern7=Pattern.compile("..8");
        Matcher matcher7=pattern7.matcher(s3);

        //^ не в квадратных скобках значит что строка нчинается с символа,
        //$ символ не в квадратных скобках значит что строка заканчивается
        Pattern pattern8=Pattern.compile("18XA$");
        Matcher matcher8=pattern8.matcher(s3);

        // "\d" - любая цифра
        Pattern pattern9=Pattern.compile("\\d");
        Matcher matcher9=pattern9.matcher(s3);

        // "\D" - любой символ кроме цифры
        Pattern pattern10=Pattern.compile("\\D.");
        Matcher matcher10=pattern10.matcher(s3);

        // "\w" - любая буква цифра или символ "_"
        Pattern pattern11=Pattern.compile("\\w");
        Matcher matcher11=pattern11.matcher(s3);

        // "\W" - любой символ кроме букв, цифр и символа "_"
        Pattern pattern12=Pattern.compile("\\W");
        Matcher matcher12=pattern12.matcher(s3);

        // "+" - любое повторение символов от 1 до бесконечности
        Pattern pattern13=Pattern.compile("[A-Z]+8");
        Matcher matcher13=pattern13.matcher(s3);

        // "+" - любое повторение символов от 1 до бесконечности
        Pattern pattern14=Pattern.compile("\\W+");
        Matcher matcher14=pattern14.matcher(s3);

        // "{n}" - n - количество повторений символов
        String s4="Nikita Oleg dicksucker Anatoli Igor Ivan Lika Alan hat dog doctor";
        Pattern pattern15=Pattern.compile("[A-Z]\\w{3}");
        Matcher matcher15=pattern15.matcher(s4);


        while (matcher.find()){
            System.out.println("Position: "+ matcher.start()+" " +matcher.end()+"   " + matcher.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher2.find()){
            System.out.println("Position: "+ matcher2.start()+" " +matcher2.end()+"   " + matcher2.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher3.find()){
            System.out.println("Position: "+ matcher3.start()+" " +matcher3.end()+"   " + matcher3.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher4.find()){
            System.out.println("Position: "+ matcher4.start()+" " +matcher4.end()+"   " + matcher4.group());
        }


        System.out.println("---------------------------------------------");
        while (matcher5.find()){
            System.out.println("Position: "+ matcher5.start()+" " +matcher5.end()+"   " + matcher5.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher6.find()){
            System.out.println("Position: "+ matcher6.start()+" " +matcher6.end()+"   " + matcher6.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher7.find()){
            System.out.println("Position: "+ matcher7.start()+" " +matcher7.end()+"   " + matcher7.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher8.find()){
            System.out.println("Position: "+ matcher8.start()+" " +matcher8.end()+"   " + matcher8.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher9.find()){
            System.out.println("Position: "+ matcher9.start()+" " +matcher9.end()+"   " + matcher9.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher10.find()){
            System.out.println("Position: "+ matcher10.start()+" " +matcher10.end()+"   " + matcher10.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher11.find()){
            System.out.println("Position: "+ matcher11.start()+" " +matcher11.end()+"   " + matcher11.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher12.find()){
            System.out.println("Position: "+ matcher12.start()+" " +matcher12.end()+"   " + matcher12.group());
        }


        System.out.println("---------------------------------------------");
        while (matcher13.find()){
            System.out.println("Position: "+ matcher13.start()+" " +matcher13.end()+"   " + matcher13.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher14.find()){
            System.out.println("Position: "+ matcher14.start()+" " +matcher14.end()+"   " + matcher14.group());
        }

        System.out.println("---------------------------------------------");
        while (matcher15.find()){
            System.out.println("Position: "+ matcher15.start()+" " +matcher15.end()+"   " + matcher15.group());
        }
    }
}
