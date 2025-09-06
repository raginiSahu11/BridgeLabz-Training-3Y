import java.util.Random;

public class StudentScoreCard {
    // Generate random PCM marks for n students
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61); // marks between 40–100
            }
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, avg, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    // Assign grade based on percentage
    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 90) grades[i] = "A";
            else if (p >= 75) grades[i] = "B";
            else if (p >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    // Display scorecard
    public static void display(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                    "\t" + (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] +
                    "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5); // 5 students
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);
        display(scores, stats, grades);
    }
}
