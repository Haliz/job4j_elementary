package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(170);
        System.out.println("Для мужчины ростом 170 см - идеальный вес " + man +" кг");
        System.out.println("Для женщины ростом 170 см - идеальный вес " + woman +" кг");
    }
}
