package org.example;

import java.util.Scanner;

public class ConditionsLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "x" + num + " = " + i*num);
        }

        scanner.close();
    }
}
