public class TotalPrice {
    private double total;

    // Konstruktor
    public TotalPrice() {
        this.total = 0.0;
    }

    // Metode untuk menambahkan harga
    public void add(double price) {
        total += price;
    }

    // Metode untuk mendapatkan total harga
    public double getTotal() {
        return total;
    }
}
