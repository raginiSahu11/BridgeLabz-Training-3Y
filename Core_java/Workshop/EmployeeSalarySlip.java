import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        int[] basicSalary = new int[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter basic salary of " + names[i] + ": ");
            basicSalary[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        System.out.println("\n--- Salary Slips ---");

        // Calculate HRA, DA, Net Salary, Tax and print slips
        for (int i = 0; i < n; i++) {
            double hra = basicSalary[i] * 0.2; // 20% HRA
            double da = basicSalary[i] * 0.1;  // 10% DA
            double grossSalary = basicSalary[i] + hra + da;

            double tax = 0;
            if (grossSalary > 50000) {
                tax = grossSalary * 0.1; // 10% tax
            }

            double netSalary = grossSalary - tax;

            // Print salary slip
            System.out.println("\nEmployee Name: " + names[i]);
            System.out.println("Basic Salary: " + basicSalary[i]);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("Tax: " + tax);
            System.out.println("Net Salary: " + netSalary);
        }

        sc.close();
    }
}
