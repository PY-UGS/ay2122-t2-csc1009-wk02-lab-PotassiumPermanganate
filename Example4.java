package com.T2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        String zodiac;
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = scanner.nextInt();

        switch (year % 12) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
            default:
                zodiac = "unknown";
        }

        System.out.println(zodiac);

    }
}
