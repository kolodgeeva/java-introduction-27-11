package com.hillel.classwork.lesson3;

public class TypeCasting {

  public static void main(String[] args) {

    byte b = 127;
    System.out.println("byte " + b);

    short sh = b;
    System.out.println("short " + sh);

    int i = 131;
    System.out.println("int " + i);

    b = (byte) i;
    System.out.println("cast byte " + b);

    b = 100;

    b = (byte) (b + 1.0);

    System.out.println("byte + 1 " + b);

    float f = 34.67F;

    byte floatToByte = (byte) f;
    System.out.println("floatToByte " + floatToByte);

    int steps = 10;
    int hours = 12;

    double result = (double) steps / hours;
    System.out.println("result: " + result);

    int res = 5 % 2;
    System.out.println(res);

    String name = "boeing";

    System.out.println("Aircraft name " + name);

    String message = "Mariana";
    printHello("hello");
    printHello(message);
    printHello("hello" + ", user " + res);

    printHello("1", "2");

    printHello(1);

  }

  public static void printHello(String message) {
    System.out.println("-----");
    System.out.println(message);
    System.out.println("-----");
  }

  public static void printHello(int number) {
    System.out.println("-----");
    System.out.println("number: " + number);
    System.out.println("-----");
  }

  public static void printHello(String message1, String message2) {
    System.out.println("-----");
    System.out.println(message1 + " " + message2);
    System.out.println("-----");
  }

}
