import java.util.Scanner;

public class OnlineShoppingCart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean shopOpen = true;

        System.out.println("Welcome to Online Shopping!");

        // Loop to handle multiple customers
        while (shopOpen) {
            System.out.println("\nNew Customer");

            double totalAmount = 0;

            // Do-while ensures at least one product is added
            do {
                System.out.print("Enter number of items to add to cart: ");
                int n = sc.nextInt();

                // For-loop to add n items
                for (int i = 1; i <= n; i++) {
                    System.out.println("\nSelect Product " + i + ":");
                    System.out.println("1. Laptop - 30000");
                    System.out.println("2. Mobile - 15000");
                    System.out.println("3. Headphones - 2000");
                    System.out.println("4. Keyboard - 1500");
                    System.out.println("5. Mouse - 1000");
                    System.out.print("Enter choice (1-5): ");
                    int choice = sc.nextInt();

                    // Switch-case to determine product price
                    switch (choice) {
                        case 1:
                            totalAmount += 30000;
                            break;
                        case 2:
                            totalAmount += 15000;
                            break;
                        case 3:
                            totalAmount += 2000;
                            break;
                        case 4:
                            totalAmount += 1500;
                            break;
                        case 5:
                            totalAmount += 1000;
                            break;
                        default:
                            System.out.println("Invalid choice, item not added.");
                    }
                }

                System.out.println("Current total amount: " + totalAmount);

                System.out.print("Do you want to add more items? (yes/no): ");
            } while (sc.next().equalsIgnoreCase("yes"));

            // If-else to apply discount
            if (totalAmount > 5000) {
                double discount = totalAmount * 0.1; // 10% discount
                totalAmount -= discount;
                System.out.println("Discount applied: " + discount);
            }

            System.out.println("Total amount to pay: " + totalAmount);

            // Check if shop should continue for next customer
            System.out.print("\nIs there another customer? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) {
                shopOpen = false;
            }
        }

        System.out.println("Shop closed. Thank you for shopping!");
        sc.close();
    }
}
