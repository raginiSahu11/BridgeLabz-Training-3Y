import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            // Multiple if-else method
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is Not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }

            // Single if condition using logical operators
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("(Using single if) " + year + " is a Leap Year.");
            } else {
                System.out.println("(Using single if) " + year + " is Not a Leap Year.");
            }
        } else {
            System.out.println("Year must be >= 1582 for Gregorian Calendar.");
        }
        sc.close();
    }
}
