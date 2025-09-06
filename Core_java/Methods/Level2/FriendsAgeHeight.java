import java.util.Scanner;

public class FriendsAgeHeight {
    public static String youngest(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIndex]) minIndex = i;
        return names[minIndex];
    }

    public static String tallest(String[] names, int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIndex]) maxIndex = i;
        return names[maxIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println("Youngest: " + youngest(names, ages));
        System.out.println("Tallest: " + tallest(names, heights));
    }
}
