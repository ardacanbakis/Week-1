// a simple java program to calculate air fare depending on user's selection

import java.util.Scanner;

public class airFareCalculator {

    public static void main(String[] args) {

        // getting input from the user

        Scanner userDistance = new Scanner(System.in);
        System.out.println("Please enter the distance you want to travel in KMs : ");
        double distance = userDistance.nextDouble();

        Scanner userAge = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = userAge.nextInt();

        Scanner userTravelType = new Scanner(System.in);
        System.out.println("Please indicate your travel type. 1 = One-Way | 2 = Round trip");
        int travelType = userTravelType.nextInt();

        if ((distance < 1) || (age < 1) || (travelType != 1 && travelType != 2)) {
            System.out.println("Wrong input, please try again.");
        } else {

            double pricePerKm = 0.1;
            double ticketPrice = pricePerKm * distance;
            double ageDiscount = 1;
            double travelTypeDiscount = 1;

            // apply age discount if available

            // any way to make it better ?

            if (age < 12) {
                ageDiscount = 0.5;
            } else if (12 <= age && age <= 24) {
            ageDiscount = 0.9;
            } else if (age >65) {
            ageDiscount = 0.7;
    }
            // apply %20 off if round trip
        if (travelType == 2 ) {
            travelTypeDiscount = 0.8;
        }
            //calculate final price
            double finalTicketPrice = ticketPrice * ageDiscount * travelTypeDiscount;

            System.out.println
                    ("Distance to be travelled : " + distance + "KM" + "\n" +
                            "Your age : " + age + "\n" +
                            "Ticket price : " + ticketPrice + "$" + "\n" +
                            "Total discount : " + (ticketPrice - finalTicketPrice) + "$" + "\n" +
                            "Ticket price after discounts : " + finalTicketPrice + "$");
        }
    }
}
