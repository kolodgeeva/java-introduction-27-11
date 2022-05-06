package com.hillel.classwork.lesson4;

public class MethodsTest {

    public static void main(String[] args) {

        printInfo();
        printInfo();
        printInfo();

        int result = sum(sum(4, sum(1, 400)), 2 + 3);
        System.out.println("result " + result);

        int result2 = sum(result, 10);
        System.out.println("result2 " + result2);

        int number = 18;
        boolean even = isEven(number);
        System.out.println(" even? " + even);

        boolean even2 = isEven(17);
        System.out.println(" even? " + even2);

        double bigger = 100;
        double smaller = 5;

        double d = divide(bigger, smaller);
        System.out.println(d);

        System.out.println(divide(smaller, bigger));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printInfo() {
        System.out.println("Some info");
    }

    public static int sum(int number1, int number2) {
        int sum = number1 + number2;
        printInfo();
        return sum;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }
}
