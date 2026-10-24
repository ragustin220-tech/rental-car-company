package com.pluralsight;

import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String []args) {

// define variables

        System.out.print("Full Name:");
        String fullName = scanner.nextLine();

        System.out.println();
//ask users age
        System.out.print("What is you age:");
        int age = scanner.nextInt();
        scanner.nextLine();
//amount of days the user will need the car
        System.out.print("How many days would you like to keep the car:");
        int days = scanner.nextInt();
        scanner.nextLine();
//when they will pick up the car
        System.out.print("When would you like to pick up the car ?(mm/dd)");
        String pickUp = scanner.nextLine();
//when they will drop of the car
        System.out.print("when would you like to drop off the car?");
        String dropOff = scanner.nextLine();
//ask if they want to add toll tag for an additional price
        System.out.print("would you like to add a toll tag for 3.95 a day? yes/no");
        char S1 = scanner.nextLine().toLowerCase().charAt(0);
// ask if they want to add gps for an additional price
        System.out.print("would you like a gps addition for 2.95 a day? yes/no");
        char S2 = scanner.nextLine().toLowerCase().charAt(0);
//ask if they want roadside assistance for an additional cost
        System.out.print("would you like to add roadside assistants for 3.95 a day ? yes/no");
        char S3 = scanner.nextLine().toLowerCase().charAt(0);



// define basic rental with base price times the amount of days rented
        double basicRental = (29.99 * days);
//if the first letter of the prompt is y then add additional cost to amount of days
        double costOfTollTag;
        if ( S1 == 'y'){
            costOfTollTag = 3.95 * days;
        }
        else{
            costOfTollTag = 0;
        }
// if y equals to y then additional cost will be multiplied to amount of days
        double costOfGPS;
        if (S2 == 'y'){
            costOfGPS = 2.95 * days;
        }
        else{
            costOfGPS = 0;
        }
// if roadside assistance is chosen then it will be multiplied to days for an additional cost
        double costOfRoadsideA;
        if (S3 == 'y'){
            costOfRoadsideA = 3.95 *days;
        }
        else {
            costOfRoadsideA = 0;
        }
//if the user is under 25 years old then they will be charged an additional surcharge of 30 percent to their total
        double surcharge = 0.0;

        if (age < 25){
            surcharge = (basicRental * .30);

        }
//define optional costs and group them together to the total
        double OptionalCost = costOfTollTag + costOfGPS + costOfRoadsideA;
        double totalCost = basicRental + OptionalCost + surcharge;
        {
        System.out.println("""
                
               
                """);
//display summary of options selected plus any additional costs
        System.out.println("Basic car Rental: " + basicRental);
        System.out.println("Optionalcost: "+ OptionalCost);
        System.out.println("Underage Driver Surcharge: " + surcharge);
        System.out.println("Your total cost is: " + totalCost);

        }

    }


    }
