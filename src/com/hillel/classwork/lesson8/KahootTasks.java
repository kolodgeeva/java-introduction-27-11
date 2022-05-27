package com.hillel.classwork.lesson8;

public class KahootTasks {

    public static void main(String[] args) {

        String test = "test";
        test += 1;
        System.out.println(test);

        String s; // 1

        String action = "create";

        if (action.equals("create")) {
            System.out.println("create user");
        } else if (action.equals("delete")) {
            System.out.println("delete user");
        }

        if ((s = "java") == "java") {// 2
            System.out.println(s + " true");
        } else {
            System.out.println(s + " false");
        }

    }
}
