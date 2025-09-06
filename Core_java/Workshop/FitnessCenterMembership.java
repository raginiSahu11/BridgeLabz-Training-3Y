import java.util.Scanner;

public class FitnessCenterMembership {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean centerOpen = true;

        System.out.println("Welcome to Fitness Center Membership Registration!");

        // Loop until admin decides to close the center
        while (centerOpen) {
            System.out.println("\nNew Member Registration");

            // At least one registration attempt (do-while)
            do {
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly");
                System.out.println("2. Quarterly");
                System.out.println("3. Yearly");
                System.out.print("Enter your choice (1-3): ");
                int membershipChoice = sc.nextInt();

                double fee = 0;
                String membershipType = "";

                // Switch-case to select membership type
                switch (membershipChoice) {
                    case 1:
                        fee = 1000; // monthly fee
                        membershipType = "Monthly";
                        break;
                    case 2:
                        fee = 2700; // quarterly fee (10% discount)
                        membershipType = "Quarterly";
                        break;
                    case 3:
                        fee = 10000; // yearly fee (17% discount)
                        membershipType = "Yearly";
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Monthly.");
                        fee = 1000;
                        membershipType = "Monthly";
                }

                System.out.print("Enter number of members to register: ");
                int numMembers = sc.nextInt();

                // For-loop to register multiple members
                for (int i = 1; i <= numMembers; i++) {
                    System.out.print("\nEnter member " + i + " name: ");
                    String name = sc.next();

                    System.out.print("Is the member a student or senior citizen? (yes/no): ");
                    String discountEligible = sc.next();

                    double finalFee = fee;

                    // If-else to apply discount
                    if (discountEligible.equalsIgnoreCase("yes")) {
                        finalFee = fee * 0.9; // 10% discount
                        System.out.println("Discount applied! Final Fee: " + finalFee);
                    } else {
                        System.out.println("No discount. Final Fee: " + finalFee);
                    }

                    System.out.println("Member " + name + " registered successfully with " + membershipType + " membership.");
                }

                // Ask if admin wants to register more members
                System.out.print("\nDo you want to register more members? (yes/no): ");
                String more = sc.next();

                if (!more.equalsIgnoreCase("yes")) {
                    centerOpen = false;
                    break;
                }

            } while (true); // ensures at least one registration
        }

        System.out.println("\nFitness Center Registration Closed. Thank you!");
        sc.close();
    }
}
