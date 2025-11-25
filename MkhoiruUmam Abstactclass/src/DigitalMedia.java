public class DigitalMedia extends LibraryItem implements Borrowable {
    private double fileSize;
    private String format;

    public DigitalMedia(String title, int year, double fileSize, String format) {
        super(title, year);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void showInfo() {
        System.out.println("Digital Media: " + title + " (" + year + ")");
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
        System.out.println("Status: " + (isBorrowed ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }

    @Override
    public void borrow() {
        if (isBorrowed) {
            System.out.println("Digital Media \"" + title + "\" sedang dipinjam!");
        } else {
            isBorrowed = true;
            System.out.println("Digital Media \"" + title + "\" berhasil dipinjam.");
        }
    }

    @Override
    public void returnItem() {
        if (!isBorrowed) {
            System.out.println("Digital Media \"" + title + "\" belum dipinjam.");
        } else {
            isBorrowed = false;
            System.out.println("Digital Media \"" + title + "\" berhasil dikembalikan.");
        }
    }
}
