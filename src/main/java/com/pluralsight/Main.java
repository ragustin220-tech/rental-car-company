package com.pluralsight;

import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String []args) {

// define variables

        System.out.print("Full Name:");
        String fullName = scanner.nextLine();

        System.out.println();

        System.out.print("What is you age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("How many days would you like to keep the car:");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.print("When would you like to pick up the car ?(mm/dd)");
        String pickUp = scanner.nextLine();

        System.out.print("when would you like to drop off the car?");
        String dropOff = scanner.nextLine();

        System.out.print("would you like to add a toll tag for 3.95 a day? yes/no");
        char S1 = scanner.nextLine().toLowerCase().charAt(0);

        System.out.print("would you like a gps addition for 2.95 a day? yes/no");
        char S2 = scanner.nextLine().toLowerCase().charAt(0);




        double basicRental = (29.99 * days);

        double costOfTollTag;
        if ( S1 == 'y'){
            costOfTollTag = 3.95 * days;
        }
        else{
            costOfTollTag = 0;
        }

        double costOfGPS;
        if (S2 == 'y'){
            costOfGPS = 2.95 * days;
        }
        else{
            costOfGPS = 0;
        }

        double surcharge = 0.0;

        if (age < 25){
            surcharge = (basicRental * .30);

        }
        {

        }

    }


    }
