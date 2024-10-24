class Book {
    private String title;
    private String author;
    private int yearPublished;
    private String publisher;
    private String category;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String title, String author, int yearPublished, String publisher, String category) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.category = category;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Tahun Terbit: " + yearPublished);
        System.out.println("Penerbit: " + publisher);
        System.out.println("Kategori: " + category);
    }

    // Kelas utama untuk demonstrasi
    public static void main(String[] args) {
        // Membuat objek Book
        Book book = new Book("Belajar Java", "John Doe", 2023, "Gramedia", "Teknologi");

        // Mencetak detail buku
        book.printDetails();
    }
}
