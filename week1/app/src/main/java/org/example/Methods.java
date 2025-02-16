package org.example;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a name");
        String x = scanner.nextLine();
        System.out.println(greet(x));
        scanner.close();
    }

    public static String greet(String name) {
        return "Hello Stoopid, " + name;
    }
}
