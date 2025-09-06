import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] uniqueChars(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count++] = c;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] getFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] freq = getFrequency(text);
        System.out.println("Character Frequency:");
        for (String[] row : freq) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}
