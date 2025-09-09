public class EmployeeSalarySlip {
    public static void main(String[] args) {
        // Employee details
        String[] names = {"Ramesh", "Suresh", "Geeta", "Anita"};
        int[] basicSalary = {30000, 55000, 45000, 70000};

        System.out.println("=== Employee Salary Slips ===\n");

        // for loop to process each employee
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int basic = basicSalary[i];

            // Calculate allowances
            double hra = basic * 0.20;  // 20% HRA
            double da = basic * 0.10;   // 10% DA
            double gross = basic + hra + da;

            double tax = 0;
            // if-else → apply tax if salary > 50000
            if (gross > 50000) {
                tax = gross * 0.10;   // 10% tax
                gross -= tax;
            }

            // Print salary slip
            System.out.println("Employee: " + name);
            System.out.println("Basic Salary: Rs. " + basic);
            System.out.println("HRA (20%): Rs. " + hra);
            System.out.println("DA (10%): Rs. " + da);
            if (tax > 0) {
                System.out.println("Tax Deducted (10%): Rs. " + tax);
            } else {
                System.out.println("Tax Deducted: Rs. 0");
            }
            System.out.println("Net Salary: Rs. " + gross);
            System.out.println("----------------------------------");
        }
    }
}
