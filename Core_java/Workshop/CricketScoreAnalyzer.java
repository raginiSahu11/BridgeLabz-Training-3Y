import java.util.Scanner;

public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();

        int[] runs = new int[n];
        System.out.println("Enter runs scored by each batsman:");
        for (int i = 0; i < n; i++) {
            runs[i] = sc.nextInt();
        }

        int highest = runs[0];
        int lowest = runs[0];
        int sum = 0;
        boolean centuryScorer = false;

        for (int i = 0; i < n; i++) {
            if (runs[i] > highest) {
                highest = runs[i];
            }
            if (runs[i] < lowest) {
                lowest = runs[i];
            }
            if (runs[i] >= 100) {
                centuryScorer = true;
            }
            sum += runs[i];
        }

        double average = (double) sum / n;

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);

        if (centuryScorer) {
            System.out.println("Century Scorer");
        }
    }
}
