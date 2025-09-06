class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book(); // default
        b1.displayDetails();

        Book b2 = new Book("Java Programming", "James Gosling", 450.0); // parameterized
        b2.displayDetails();
    }
}
