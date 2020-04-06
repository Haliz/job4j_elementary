package ru.job4j.converter;

public class Converter {
    /** Модуль перевода: рубли в евро.*/
    public static int ruToEu(int value) {
        int rsl = value / 70;
        return rsl;
    }
    /** Модуль перевода: евро в рубли.*/
    public static int euToRU(int value) {
        int rsl = value * 70;
        return rsl;
    }
    /** Модуль перевода: рубли в баксы.*/
    public static int ruToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }
    /** Модуль перевода: баксы в рубли.*/
    public static int dollarToRu(int value) {
        int rsl = value * 60;
        return rsl;
    }
    public static void main(String[] args){
        int euro = Converter.ruToEu(140);
        int dollar = Converter.ruToDollar(140);
        int ruFromEuro = Converter.euToRU(2);
        int ruFromDollar = Converter.dollarToRu(2);
        System.out.println("140 rubles are "+ euro + " euro");
        System.out.println(" 2 euro are " + ruFromEuro + " rubles");
        System.out.println("140 rubles are " + dollar + " dollars");
        System.out.println(" 2 dollars are " + ruFromDollar + " rubles");

        /** Далее тестирование:*/

        /**Для Евро*/
        int in = 140;
        int expected = 2;
        int out = Converter.ruToEu(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 EU. Test result : " + passed);
        /** Рубли из евро*/
        in = 2;
        expected = 140;
        out = Converter.euToRU(in);
        passed = expected == out;
        System.out.println("2 EU are 140 rubles. Test result : " + passed);
        /**Для Бакса*/
        in = 300;
        expected = 5;
        out = Converter.ruToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 5 $. Test result : " + passed);
        /** Рубли из бакса*/
        in = 5;
        expected = 300;
        out = Converter.dollarToRu(in);
        passed = expected == out;
        System.out.println("5 $ are 300 rubles. Test result : " + passed);
    }
}