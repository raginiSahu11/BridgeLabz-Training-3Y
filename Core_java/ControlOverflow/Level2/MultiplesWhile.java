import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int num = sc.nextInt();

        if (num > 0 && num < 100) {
            System.out.println("Multiples of " + num + " below 100:");
            int i = 1;
            while (i < 100) {
                if (i % num == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Invalid number.");
        }

        sc.close();
    }
}

