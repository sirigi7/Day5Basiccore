package assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a year (4 digits): ");
        int year = input.nextInt();
        input.close();

        // Check if it's a leap year
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If the year is divisible by 100, it's a leap year only if it's also divisible by 400
                isLeapYear = (year % 400 == 0);
            } else {
                // Otherwise, it's a leap year if it's divisible by 4
                isLeapYear = true;
            }
        }

        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
