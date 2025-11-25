import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LibraryItem[] items = {
            new Book("The Pragmatic Programmer", 1999, "Andrew Hunt & David Thomas"),
            new Magazine("Time Magazine", 2024, "Edisi Januari"),
            new DigitalMedia("Python Tutorial Series", 2021, 850, "MP4")
        };

        System.out.println("=== Sistem Perpustakaan ===\n");
        System.out.println("Daftar Item:");

        for (int i = 0; i < items.length; i++) {
            System.out.print((i + 1) + ". ");
            items[i].showInfo();
        }

        System.out.print("Pilih item (1/2/3): ");
        int pilihItem = input.nextInt();
        LibraryItem selected = items[pilihItem - 1];

        System.out.println("\nAksi:");
        System.out.println("1. Pinjam");
        System.out.println("2. Kembalikan");
        System.out.print("Masukkan pilihan: ");
        int aksi = input.nextInt();

        Borrowable b = (Borrowable) selected;

        if (aksi == 1) {
            b.borrow();
        } else if (aksi == 2) {
            b.returnItem();
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
