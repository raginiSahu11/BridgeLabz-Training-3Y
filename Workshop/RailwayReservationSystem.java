import java.util.Scanner;

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seats = 5;  // Total available seats
        int bookedSeats = 0;

        System.out.println("=== Welcome to Railway Reservation System ===");

        // Show train options using switch-case
        System.out.println("Choose Train Option:");
        System.out.println("1. Express Train (Fare: 500)");
        System.out.println("2. Superfast Train (Fare: 800)");
        System.out.println("3. Luxury Train (Fare: 1500)");

        int choice = sc.nextInt();
        int fare = 0;

        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You selected Express Train");
                break;
            case 2:
                fare = 800;
                System.out.println("You selected Superfast Train");
                break;
            case 3:
                fare = 1500;
                System.out.println("You selected Luxury Train");
                break;
            default:
                System.out.println("Invalid Choice! Defaulting to Express Train (Fare: 500)");
                fare = 500;
        }

        // At least one booking attempt (do-while)
        do {
            System.out.println("\nEnter number of passengers to book tickets for: ");
            int passengers = sc.nextInt();

            // Loop for each passenger
            for (int i = 1; i <= passengers; i++) {
                if (bookedSeats < seats) {
                    bookedSeats++;
                    System.out.println("Passenger " + i + " -> Ticket Confirmed. Seat No: " + bookedSeats + " | Fare: " + fare);
                } else {
                    System.out.println("Passenger " + i + " -> Added to Waiting List.");
                }
            }

            // Continue until train is full
            if (bookedSeats >= seats) {
                System.out.println("\nAll seats are booked. Further passengers will be in Waiting List.");
                break;
            }

            System.out.println("\nDo you want to continue booking? (yes=1 / no=0): ");
        } while (sc.nextInt() == 1);

        System.out.println("\n=== Booking Closed ===");
        System.out.println("Total Confirmed Bookings: " + bookedSeats);
        System.out.println("Total Seats: " + seats);
        sc.close();
    }
}
