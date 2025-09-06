import java.util.Scanner;

public class CinemaSeatAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5;
        int cols = 10;
        String[][] seats = new String[rows][cols];

        // Initialize all seats as empty
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = "Empty";
            }
        }

        boolean continueBooking = true;

        while (continueBooking) {
            System.out.println("\n--- Cinema Seat Layout ---");
            displaySeats(seats);

            System.out.print("\nEnter number of people in the family (3 only for this example): ");
            int familySize = sc.nextInt();

            if (familySize == 3) {
                boolean booked = false;
                for (int i = 0; i < rows; i++) {
                    int consecutive = 0;
                    for (int j = 0; j < cols; j++) {
                        if (seats[i][j].equals("Empty")) {
                            consecutive++;
                            if (consecutive == familySize) {
                                // Book the 3 seats
                                for (int k = j - 2; k <= j; k++) {
                                    seats[i][k] = "Booked";
                                }
                                System.out.println("Seats booked for family at Row " + (i + 1) + ", Seats " + (j - 1) + "-" + j);
                                booked = true;
                                break;
                            }
                        } else {
                            consecutive = 0; // reset count if seat is booked
                        }
                    }
                    if (booked) break;
                }
                if (!booked) {
                    System.out.println("No 3 adjacent seats available for the family.");
                }
            } else {
                System.out.println("Currently only families of 3 are supported.");
            }

            System.out.print("\nDo you want to book another family? (yes/no): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("no")) {
                continueBooking = false;
            }
        }

        sc.close();
        System.out.println("Final Cinema Seat Layout:");
        displaySeats(seats);
    }

    // Method to display the seat layout
    public static void displaySeats(String[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].equals("Empty")) {
                    System.out.print("[E] ");
                } else {
                    System.out.print("[B] ");
                }
            }
            System.out.println();
        }
    }
}
