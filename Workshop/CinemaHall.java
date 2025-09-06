public class CinemaHall {
    static int ROWS = 5;
    static int COLS = 10;
    static int[][] seats = new int[ROWS][COLS];

    // Method to book consecutive seats
    public static boolean bookSeats(int familySize) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col <= COLS - familySize; col++) {
                boolean available = true;
                // check consecutive seats
                for (int k = 0; k < familySize; k++) {
                    if (seats[row][col + k] == 1) {
                        available = false;
                        break;
                    }
                }
                // if found, mark as booked
                if (available) {
                    for (int k = 0; k < familySize; k++) {
                        seats[row][col + k] = 1;
                    }
                    System.out.println("Seats booked at Row " + (row+1) + " from Seat " + (col+1) + " to " + (col+familySize));
                    return true;
                }
            }
        }
        System.out.println("Not available");
        return false;
    }

    // Method to display seats
    public static void displaySeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        bookSeats(3); // first family
        bookSeats(3); // second family
        bookSeats(3); // third family
        displaySeats();
    }
}
