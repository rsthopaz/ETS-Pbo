class ParkingTicketMachine {
    private int balance; // Jumlah nominal uang yang dimasukkan
    private final int ticketPrice = 5000; // Harga tiket parkir per jam
    private int ticketTime; // Jumlah waktu parkir yang dibeli dalam jam

    // Metode untuk menambahkan uang yang dimasukkan
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang yang dimasukkan: Rp" + amount);
            System.out.println("Saldo saat ini: Rp" + balance);
        } else {
            System.out.println("Jumlah uang harus positif.");
        }
    }

    // Metode untuk mengeluarkan tiket
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice; // Mengatur waktu parkir sesuai saldo
            balance = 0; // Mengatur saldo ke 0 setelah mengeluarkan tiket
            System.out.println("Tiket dikeluarkan! Waktu parkir: " + ticketTime + " jam.");
        } else {
            System.out.println("Saldo tidak cukup untuk mengeluarkan tiket.");
        }
    }

    // Metode untuk mengembalikan jumlah jam parkir yang telah dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Kelas utama untuk demonstrasi
    public static void main(String[] args) {
        ParkingTicketMachine ticketMachine = new ParkingTicketMachine();

        // Menambahkan uang
        ticketMachine.insertMoney(20000); // Memasukkan Rp20.000
        ticketMachine.issueTicket(); // Mengeluarkan tiket

        // Mencetak waktu parkir yang telah dibeli
        System.out.println("Jumlah jam parkir yang dibeli: " + ticketMachine.getTimePurchased() + " jam.");
    }
}
