package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Variables {
    //How to declare variables
    int edad = 25;
    double precio = 19.99;
    boolean isActive = true;
    String name = "Juan";

    int suma = 10 + 5;
    double division = 10.0 / 3;
    boolean isHigher = 10 > 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input radius of a circle");
        int radius = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");
        double area = Math.round(Math.PI*Math.pow(radius, 2) * 100 / 100);
        System.out.println("Area of given radius: " + df.format(area));

        scanner.close();
    }

}
