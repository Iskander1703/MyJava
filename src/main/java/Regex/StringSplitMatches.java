package Regex;

import java.util.Arrays;

public class StringSplitMatches {
    public static void main(String[] args) {
        String data="Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48,"+
                " email: vivanov@mail.ru, Postcode: AA99, Phone number: +79373303311;"+
                "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18,"+
                " email: masha@yandex.ru, Postcode: UKR54, Phone number: +380444618061;"+
                "Chuk Norris, USA, Hollywood, All stars street, 87, Flat 21,"+
                " email: chuck@gmail.com, Postcode: USA23, Phone number: +781017754894;";

        String s1 ="chuck@gmail.com";
        String s2 ="vivanov@mail.ru";
        boolean aBoolean=s1.matches("\\w+@\\w+\\.(com|ru)");
        boolean bBoolean=s2.matches("\\w+@\\w+\\.(com|ru)");
        boolean cBoolean=data.matches(".+");
        System.out.println(aBoolean);
        System.out.println(bBoolean);
        System.out.println(cBoolean);

        String [] arr=data.split(" ");
        Arrays.stream(arr).forEach(System.out::println);
    }


}
