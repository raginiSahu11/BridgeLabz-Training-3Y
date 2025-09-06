import java.util.*;

public class ShortestLongest {
    public static void findShortestLongest(String text) {
        String[] words = text.split(" ");
        String shortest = words[0], longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        findShortestLongest(text);
    }
}
