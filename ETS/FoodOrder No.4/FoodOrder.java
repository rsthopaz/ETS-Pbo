import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<MenuItem> menuItems; // Daftar item menu yang dipesan
    private TotalPrice totalPrice; // Total harga pemesanan
    private IsPaid isPaid; // Status pembayaran

    // Konstruktor
    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = new TotalPrice();
        this.isPaid = new IsPaid();
    }

    // Metode untuk menambahkan item menu
    public void addMenuItem(String name, double price) {
        MenuItem item = new MenuItem(name, price);
        menuItems.add(item);
        totalPrice.add(price); // Menambahkan harga item ke total
    }

    // Metode untuk membayar pesanan
    public void pay() {
        if (!isPaid.isPaid()) {
            isPaid.pay(); // Menandai bahwa pesanan sudah dibayar
            System.out.println("Pesanan telah dibayar.");
        } else {
            System.out.println("Pesanan sudah dibayar sebelumnya.");
        }
    }

    // Metode untuk mendapatkan total harga
    public double getTotalPrice() {
        return totalPrice.getTotal();
    }

    // Metode untuk mendapatkan daftar menu
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Metode untuk menampilkan rincian pesanan
    public void displayOrderDetails() {
        System.out.println("Daftar Pesanan:");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total Harga: " + getTotalPrice());
        System.out.println("Status Pembayaran: " + (isPaid.isPaid() ? "Sudah Dibayar" : "Belum Dibayar"));
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.addMenuItem("Nasi Goreng", 25000);
        order.addMenuItem("Ayam Penyet", 30000);
        order.addMenuItem("Teh Manis", 5000);

        order.displayOrderDetails();

        order.pay();

        order.displayOrderDetails();
    }
}
