package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String []args) {

// define variables

        System.out.print("Full Name:");
        String fullName = scanner.nextLine();
        int basicRental = (int) 29.99;
        double surcharge = (.70);
        System.out.println();

        System.out.print("What is you age:");
        String age = scanner.nextLine();
        System.out.print("How many days would you like to keep the car:");
        String days = scanner.nextLine();
        System.out.print("When would you like to pick up the car ?(mm/dd)");
        String pickUp = scanner.nextLine();
        System.out.print("when would you like to drop off the car?");
        String dropOff = scanner.nextLine();
        System.out.print("would you like to add a toll tag for 3.95 a day? yes/no");
        String tollTag = scanner.nextLine();
        System.out.print("would you like a gps addition for 2.95 a day? yes/no");
        String gps = scanner.nextLine();

    

    }


    }

    
}
