public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // causes exception
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        // generateException();  // will crash
        handleException();
    }
}
