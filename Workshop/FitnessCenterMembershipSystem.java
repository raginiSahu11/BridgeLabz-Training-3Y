import java.util.Scanner;

public class FitnessCenterMembershipSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Fitness Center Membership System ===");

        boolean keepRunning = true;  // while loop condition

        // do-while ensures at least one registration
        do {
            System.out.println("\nEnter number of members to register in this batch: ");
            int members = sc.nextInt();

            // for loop → register multiple members
            for (int i = 1; i <= members; i++) {
                System.out.println("\nRegistering Member " + i);

                System.out.println("Choose Membership Type:");
                System.out.println("1. Monthly (Rs. 1000)");
                System.out.println("2. Quarterly (Rs. 2500)");
                System.out.println("3. Yearly (Rs. 9000)");
                int choice = sc.nextInt();

                int fee = 0;

                // switch-case for membership type
                switch (choice) {
                    case 1:
                        fee = 1000;
                        System.out.println("Membership Selected: Monthly");
                        break;
                    case 2:
                        fee = 2500;
                        System.out.println("Membership Selected: Quarterly");
                        break;
                    case 3:
                        fee = 9000;
                        System.out.println("Membership Selected: Yearly");
                        break;
                    default:
                        System.out.println("Invalid choice! Defaulting to Monthly.");
                        fee = 1000;
                }

                // if-else for discount eligibility
                System.out.println("Is the member a Student or Senior Citizen? (yes=1 / no=0): ");
                int discountChoice = sc.nextInt();

                if (discountChoice == 1) {
                    double discount = fee * 0.2;  // 20% discount
                    fee -= discount;
                    System.out.println("Discount applied: Rs. " + discount);
                } else {
                    System.out.println("No discount applied.");
                }

                System.out.println("Final Membership Fee for Member " + i + ": Rs. " + fee);
            }

            // while loop → keep registering until admin exits
            System.out.println("\nDo you want to register more members? (yes=1 / no=0): ");
            int cont = sc.nextInt();
            if (cont == 0) {
                keepRunning = false;
            }

        } while (keepRunning);

        System.out.println("\n=== Registration Closed. Thank You! ===");
        sc.close();
    }
}
