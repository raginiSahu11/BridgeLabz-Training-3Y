import java.util.Scanner;

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean moreCustomers = true;  

        System.out.println("=== Welcome to Online Shopping Cart System ===");
        while (moreCustomers) {
            double totalAmount = 0;
            int items;
            do {
                System.out.print("\nEnter number of items to add to cart (at least 1): ");
                items = sc.nextInt();
            } while (items < 1);
            for (int i = 1; i <= items; i++) {
                System.out.println("\nSelect Product " + i + ":");
                System.out.println("1. Mobile (Rs. 20000)");
                System.out.println("2. Headphones (Rs. 2000)");
                System.out.println("3. Laptop (Rs. 60000)");
                System.out.println("4. Watch (Rs. 3000)");
                System.out.println("5. Shoes (Rs. 4000)");

                int choice = sc.nextInt();
                int price = 0;
                switch (choice) {
                    case 1:
                        price = 20000;
                        System.out.println("Added Mobile - Rs. " + price);
                        break;
                    case 2:
                        price = 2000;
                        System.out.println("Added Headphones - Rs. " + price);
                        break;
                    case 3:
                        price = 60000;
                        System.out.println("Added Laptop - Rs. " + price);
                        break;
                    case 4:
                        price = 3000;
                        System.out.println("Added Watch - Rs. " + price);
                        break;
                    case 5:
                        price = 4000;
                        System.out.println("Added Shoes - Rs. " + price);
                        break;
                    default:
                        System.out.println("Invalid choice! Adding default item Shoes - Rs. 4000");
                        price = 4000;
                }

                totalAmount += price;
            }
            if (totalAmount > 5000) {
                double discount = totalAmount * 0.1;  
                totalAmount -= discount;
                System.out.println("\nDiscount Applied: Rs. " + discount);
            } else {
                System.out.println("\nNo discount applied.");
            }

            System.out.println("Final Bill Amount: Rs. " + totalAmount);
            System.out.print("\nIs there another customer? (yes=1 / no=0): ");
            int cont = sc.nextInt();
            if (cont == 0) {
                moreCustomers = false;
            }
        }

        System.out.println("\n=== Shopping Session Closed. Thank You! ===");
        sc.close();
    }
}
