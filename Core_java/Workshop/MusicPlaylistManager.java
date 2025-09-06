import java.util.Scanner;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] songs = {"Song1", "Song2", "Song3", "Song4", "Song5"};
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Music Playlist Manager ---");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nPlaying all songs:");
                    for (int i = 0; i < songs.length; i++) {
                        System.out.println((i + 1) + ". " + songs[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter song index (1-" + songs.length + "): ");
                    int index = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (index >= 1 && index <= songs.length) {
                        System.out.println("Playing song: " + songs[index - 1]);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter song name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(searchName)) {
                            System.out.println("Song found: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found in playlist.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Music Playlist Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
