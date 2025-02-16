package org.example;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        System.out.println("Hola, Java");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}