class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " items added to cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " items removed from cart.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    double calculateTotal() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Headphones", 1500, 2);
        cart.displayCart();
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayCart();
    }
}
