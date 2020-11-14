package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        /**
         * Решил сделать одной формулой сразу вычисляя площадь
         */
        double rsl = (Math.pow((p/(2*(k+1))), 2)) * k;
        return rsl;
    }
    public static void main(String[] args) {
        double result1 = SqArea.square(4,1);
        double result2 = SqArea.square(6,2);
        System.out.println(" P = 4, k = 1, S = 1, real = "+ result1);
        System.out.println(" P = 6, k = 2, S = 2, real = "+ result2);
    }
}
