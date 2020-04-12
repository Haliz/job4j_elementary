package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
       return   a/2+b/2+c/2;

    }

    public double area() {
        double rsl = -1;
        double sideA = first.distance(second);
        double sideB = first.distance(third);
        double sideC = second.distance(third);
        double p = period(sideA, sideB, sideC);
        if (exist(sideA, sideB, sideC)) {
            rsl = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        }
        /** Так думаю было бы короче воспользоваться методом который был давно сделан
         * rsl = TrgArea.area(sideA, sideB, sideC)
         * Можно было бы удалить здесь метод и переменную связанную с полупериметром (там он есть).
         */
        return rsl;
    }

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(10, 0);
        Triangle triangle = new Triangle(a,b,c);
        System.out.println("Площадь треукольника" + triangle.area());
    }
}
