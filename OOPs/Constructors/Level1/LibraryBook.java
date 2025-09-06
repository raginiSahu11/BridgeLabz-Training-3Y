class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("OOP in Java", "Herbert Schildt", 500);
        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
        book.borrowBook(); // try borrowing again
    }
}
