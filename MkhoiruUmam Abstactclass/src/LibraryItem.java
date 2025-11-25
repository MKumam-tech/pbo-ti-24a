public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected boolean isBorrowed;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
        this.isBorrowed = false;
    }

    public abstract void showInfo();
}
