package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

    public static void main(String[] args) {
        String data="Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48,"+
                " email: vivanov@mail.ru, Postcode: AA99, Phone number: +79373303311;"+
                "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18,"+
                " email: masha@yandex.ru, Postcode: UKR54, Phone number: +380444618061;"+
                "Chuk Norris, USA, Hollywood, All stars street, 87, Flat 21,"+
                " email: chuck@gmail.com, Postcode: USA23, Phone number: +781017754894;";

        //Вывести все числа из 2 цифр. "/b" - соответсвует границе слова
        //"/B" соответсвует границе не слова
        Pattern pattern1=Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher=pattern1.matcher(data);
        while (matcher.find()){
            System.out.println("Position: "+ matcher.start()+" "+ matcher.end()+" Value: "+matcher.group());
        }

        Pattern pattern2=Pattern.compile("\\w{3,}@[A-Za-z]{2,}\\.[A-Za-z]{2,}");
        Matcher matcher2=pattern2.matcher(data);
        while (matcher2.find()){
            System.out.println("Position: "+ matcher2.start()+" "+ matcher2.end()+" Value: "+matcher2.group());
        }

        Pattern pattern3=Pattern.compile("\\+\\d{9,}\\b");
        Matcher matcher3=pattern3.matcher(data);
        while (matcher3.find()){
            System.out.println("Position: "+ matcher3.start()+" "+ matcher3.end()+" Value: "+matcher3.group());
        }

        Pattern pattern4=Pattern.compile("\\w+@[A-Za-z]+\\.(ru|ua)");
        Matcher matcher4=pattern4.matcher(data);
        while (matcher4.find()){
            System.out.println("Position: "+ matcher4.start()+" "+ matcher4.end()+" Value: "+matcher4.group());
        }

        //{2,} - можно указывать диапазоны, сколько раз повторяется, в данном случае 2+
        //{2,4} - повторение от 2 до 4 включительно
        String s3="aXBDSZLKFKPWSd?!.)(;%$nZlZlfscX8HX7ZD8SDKLFdks fZlZlZlkskj_8ZdslXzZ1Z1Xdmskfl92XZ18XA";
        Pattern pattern5=Pattern.compile("(Zl|Z1){2,3}");
        Matcher matcher5=pattern5.matcher(s3);

        //? -может идти символ, а может его и не быть от 0 до 1
        String s4="aXBDSZLKFKPWSd?!.)(;%$nZlZlfscX8HX7Za5D8SDKLFdks fZlZlZlakskj_8ZdslXzZ1Z1aXdmskfl92XZ18XA";
        Pattern pattern6=Pattern.compile("(Zl|Z1){2,3}a?");
        Matcher matcher6=pattern6.matcher(s4);

        //* -может идти символ, а может его и не быть от 0 до бексонечности повторений
        String s5="aXBDSZLKFKPWSd?!.)(;%$nZlZlfscX8HX7ZD8SDKLFdks fZlZlZlaaaaakskj_8ZdslXzZ1Z1aXdmskfl92XZ18XA";
        Pattern pattern7=Pattern.compile("(Zl|Z1){2,3}a*");
        Matcher matcher7=pattern7.matcher(s5);

        // "\A" - строка начинается с символа
        String s6="aXBDSZLKFKPWSd?!.)(;%$nZlZlfscX8HX7ZD8SDKLFdks axfZlZlZlaaaaakskj_8ZdslXzZ1Z1aXdmskfl92XZ18XA";
        Pattern pattern8=Pattern.compile("\\AaX");
        Matcher matcher8=pattern8.matcher(s6);

        // "\Z" - строка заканчивается с символа
        String s7="aXBDSZLKFKPWSd?!.)(;%$nZlZlfscX8HX7ZD8SDKa5LFdks axfZlZlZlaaaaaksd11kj_8ZdslXzZc91Z1aXdmskfl92XZ18XA";
        Pattern pattern9=Pattern.compile("XA\\Z");
        Matcher matcher9=pattern9.matcher(s7);

        // пример регулярного выражения
        String s8="aXBDSZLKFKPWSd?!.)(;%$nZlZlfscX8HX7ZD8SDKLFdks axfa5ZlZlZlaaaaakskj_8ZdslXzZ1c9Z1aXdmskfd8l92XZ18XA";
        Pattern pattern10=Pattern.compile("[abcde][0-9i-z]");
        Matcher matcher10=pattern10.matcher(s8);

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


    }
}
