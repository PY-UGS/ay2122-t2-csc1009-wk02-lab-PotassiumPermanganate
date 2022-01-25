package com.T2;

import java.util.Scanner;

class Example1 {


    public static void main(String args[]) {

        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the radius: ");
        float radius = scanner.nextFloat();

        System.out.println("The area for the circle of radius " +
                radius +
                " is " +
                radius * radius * PI);

    }

}