class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(); // calls default
        c1.displayDetails();

        Circle c2 = new Circle(5.5); // parameterized
        c2.displayDetails();
    }
}
