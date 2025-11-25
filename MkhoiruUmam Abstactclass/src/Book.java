public class Book extends LibraryItem implements Borrowable {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public void showInfo() {
        System.out.println("Buku: " + title + " (" + year + ")");
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isBorrowed ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }

    @Override
    public void borrow() {
        if (isBorrowed) {
            System.out.println("Buku \"" + title + "\" sedang dipinjam!");
        } else {
            isBorrowed = true;
            System.out.println("Buku \"" + title + "\" berhasil dipinjam.");
        }
    }

    @Override
    public void returnItem() {
        if (!isBorrowed) {
            System.out.println("Buku \"" + title + "\" belum dipinjam.");
        } else {
            isBorrowed = false;
            System.out.println("Buku \"" + title + "\" berhasil dikembalikan.");
        }
    }
}