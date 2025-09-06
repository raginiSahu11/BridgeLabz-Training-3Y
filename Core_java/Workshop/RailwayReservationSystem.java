import java.util.Scanner;

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Train options with fares
        System.out.println("Welcome to Railway Reservation System!");
        System.out.println("Available Trains:");
        System.out.println("1. Express Train - Fare: 500");
        System.out.println("2. Superfast Train - Fare: 800");
        System.out.println("3. Local Train - Fare: 200");

        System.out.print("Select a train (1-3): ");
        int trainChoice = sc.nextInt();
        int fare = 0;
        String trainName = "";

        // Using switch-case for train selection
        switch (trainChoice) {
            case 1:
                fare = 500;
                trainName = "Express Train";
                break;
            case 2:
                fare = 800;
                trainName = "Superfast Train";
                break;
            case 3:
                fare = 200;
                trainName = "Local Train";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Express Train.");
                fare = 500;
                trainName = "Express Train";
        }

        System.out.println("You selected: " + trainName + " | Fare: " + fare);

        int totalSeats = 5; // total seats available
        int bookedSeats = 0;
        int waitingList = 0;

        // Booking loop using do-while
        do {
            System.out.println("\nBooking attempt #" + (bookedSeats + waitingList + 1));

            if (bookedSeats < totalSeats) {
                System.out.print("Enter passenger name: ");
                String name = sc.next();
                bookedSeats++;
                System.out.println("Booking confirmed for " + name + ". Seat number: " + bookedSeats);
            } else {
                waitingList++;
                System.out.println("Sorry, train is full. You are added to the waiting list. Position: " + waitingList);
            }

            System.out.print("Do you want to book another ticket? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }

        } while (bookedSeats < totalSeats || waitingList > 0);

        System.out.println("\nBooking Summary:");
        System.out.println("Total seats booked: " + bookedSeats);
        System.out.println("Passengers in waiting list: " + waitingList);
        System.out.println("Thank you for using Railway Reservation System!");
    }
}
