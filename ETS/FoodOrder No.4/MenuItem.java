public class MenuItem {
    private String name;
    private double price;

    // Konstruktor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter untuk nama
    public String getName() {
        return name;
    }

    // Getter untuk harga
    public double getPrice() {
        return price;
    }
}
