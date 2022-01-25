package com.T2;

import java.util.Scanner;
import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {

        long[] buffer = new long[3];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 number: ");
        for (int i=0; i<3; i++){
           buffer[i] = scanner.nextLong();
        }

        System.out.println("The average of " +
                Float.toString(buffer[0]) +
                " " +
                Float.toString(buffer[1]) +
                " " +
                Float.toString(buffer[2]) +
                " is " +
                Arrays.stream(buffer).sum()/3.0);

    }
}
