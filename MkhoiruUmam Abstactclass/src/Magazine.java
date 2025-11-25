public class Magazine extends LibraryItem implements Borrowable {
    private String edition;

    public Magazine(String title, int year, String edition) {
        super(title, year);
        this.edition = edition;
    }

    @Override
    public void showInfo() {
        System.out.println("Majalah: " + title + " (" + year + ")");
        System.out.println("Edisi: " + edition);
        System.out.println("Status: " + (isBorrowed ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }

    @Override
    public void borrow() {
        if (isBorrowed) {
            System.out.println("Majalah \"" + title + "\" sedang dipinjam!");
        } else {
            isBorrowed = true;
            System.out.println("Majalah \"" + title + "\" berhasil dipinjam.");
        }
    }

    @Override
    public void returnItem() {
        if (!isBorrowed) {
            System.out.println("Majalah \"" + title + "\" belum dipinjam.");
        } else {
            isBorrowed = false;
            System.out.println("Majalah \"" + title + "\" berhasil dikembalikan.");
        }
    }
}