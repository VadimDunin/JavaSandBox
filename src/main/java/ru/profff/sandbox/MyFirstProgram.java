package ru.profff.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {

        System.out.println("Hello world");
        //math_experiments();
        int l =8;
        System.out.println("Площадь квадрата со стороной " + l + "равна:" + (l*l) );
    }

    private static void math_experiments() {
        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2*2);
        System.out.println(1/2);
        System.out.println(1.0/2);
        System.out.println(1/2.0);
        System.out.println("2" + "2");
        System.out.println("2" + 2);
        System.out.println(2 + "2");
        System.out.println((2 + 2)*2);
        System.out.println("2 + 2 =" + 2 +2);
        System.out.println("2 + 2 = " + (2+2));
    }
}
