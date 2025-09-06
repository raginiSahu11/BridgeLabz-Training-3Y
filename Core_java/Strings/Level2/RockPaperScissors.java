import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            System.out.println("Computer chose: " + compChoice);
            System.out.println("Result: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;
        System.out.printf("User Win %%: %.2f%%\n", userPercent);
        System.out.printf("Computer Win %%: %.2f%%\n", compPercent);

        sc.close();
    }
}
