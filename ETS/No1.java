// Kelas induk
class Hewan {
    public void suara() {
        System.out.println("Hewan membuat suara");
    }
}

// Kelas turunan
class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing meow");
    }
}

// Kelas utama untuk demonstrasi
public class No1 {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.suara(); // Output: Hewan membuat suara

        Kucing kucing = new Kucing();
        kucing.suara(); // Output: Kucing meow

        // Menggunakan polymorphism
        Hewan hewanKucing = new Kucing();
        hewanKucing.suara(); // Output: Kucing meow
    }
}
