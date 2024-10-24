public class IsPaid {
    private boolean paid;

    // Konstruktor
    public IsPaid() {
        this.paid = false;
    }

    // Metode untuk menandai pembayaran
    public void pay() {
        paid = true;
    }

    // Metode untuk memeriksa status pembayaran
    public boolean isPaid() {
        return paid;
    }
}
