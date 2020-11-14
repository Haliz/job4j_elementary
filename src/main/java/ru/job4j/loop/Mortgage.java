package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        double fullAmount = (amount + (amount * percent/100));
        int year = 1;
        while (salary < fullAmount ) {
            year ++;
            fullAmount = (fullAmount - salary) + ((fullAmount - salary) * percent/100);
        }
        return year;
    }
}
