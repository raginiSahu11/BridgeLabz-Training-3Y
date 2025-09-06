import java.util.Scanner;

public class DeckOfCards {

    // Initialize deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    // Distribute cards
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cannot distribute equally!");
            return new String[0][0];
        }

        String[][] result = new String[players][n / players];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n / players; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[][] result = distributeCards(deck, n, players);

        for (int i = 0; i < result.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : result[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }
}
