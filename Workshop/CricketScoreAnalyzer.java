import java.util.Scanner;

public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of players
        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();

        int[] runs = new int[n];

        // Input runs scored by each batsman
        System.out.println("Enter runs scored by each batsman:");
        for (int i = 0; i < n; i++) {
            runs[i] = sc.nextInt();
        }

        // Initialize with first batsman's score
        int highest = runs[0];
        int lowest = runs[0];
        int sum = 0;

        // Loop to analyze scores
        for (int i = 0; i < n; i++) {
            int score = runs[i];
            sum += score;

            // Check highest and lowest
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }

            // Check for century scorer
            if (score >= 100) {
                System.out.println("Century Scorer: Batsman " + (i + 1) + " with " + score + " runs");
            }
        }

        double average = (double) sum / n;

        // Display results
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);

        sc.close();
    }
}
