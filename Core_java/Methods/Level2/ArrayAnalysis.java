import java.util.Scanner;

public class ArrayAnalysis {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (!isPositive(num)) System.out.println(num + " is Negative");
            else System.out.println(num + " is Positive & " + (isEven(num) ? "Even" : "Odd"));
        }

        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("First and last are equal");
        else if (cmp > 0) System.out.println("First is greater than last");
        else System.out.println("First is smaller than last");
    }
}
