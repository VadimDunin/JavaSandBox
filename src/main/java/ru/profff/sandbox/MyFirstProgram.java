package ru.profff.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Vadim");
        double l = 10;
        System.out.println("Площадь квадрата равна " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника равна "+ area(a, b));

    }

    public static void hello(String somebody) {
        //String somebody = "world";
        System.out.println("Hello, " + somebody);
    }

    public static double area(double len) {
        return len * len;
    }
    public static double area(double a, double b) {
        return a * b;
    }
}
