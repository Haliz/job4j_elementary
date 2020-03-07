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
        int euro = Converter.ruToEu(140); // Вызов Рубли в Евро
        int dollar = Converter.ruToDollar(140); // Вызов Рубли в Баксы
        int ruFromEuro = Converter.euToRU(2);// Вызов Евро в Руби
        int ruFromDollar = Converter.dollarToRu(2); // Вызов Баксы в Рубли
        System.out.println("140 rubles are "+ euro + " euro");
        System.out.println(" 2 euro are " + ruFromEuro + " rubles");
        System.out.println("140 rubles are " + dollar + " dollars");
        System.out.println(" 2 dollars are " + ruFromDollar + " rubles");

    }
}