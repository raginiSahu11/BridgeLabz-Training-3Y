import java.util.Scanner;

public class CinemaSeatAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 5, cols = 10;
        int[][] seats = new int[rows][cols];

        System.out.println("=== Cinema Seat Allocation System ===");

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Book 3 seats for a family");
            System.out.println("2. Show seating arrangement");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean booked = false;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j <= cols - 3; j++) {
                            if (seats[i][j] == 0 && seats[i][j + 1] == 0 && seats[i][j + 2] == 0) {
                                seats[i][j] = seats[i][j + 1] = seats[i][j + 2] = 1;
                                System.out.println("Booked 3 seats at Row " + (i + 1) +
                                        " Seats " + (j + 1) + "-" + (j + 3));
                                booked = true;
                                break;
                            }
                        }
                        if (booked) break;
                    }

                    if (!booked) {
                        System.out.println("No 3 adjacent seats available!");
                    }
                    break;

                case 2:
                    System.out.println("\nSeating Arrangement (0=Empty, 1=Booked):");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            System.out.print(seats[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
