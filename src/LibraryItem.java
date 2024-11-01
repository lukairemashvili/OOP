abstract class LibraryItem {
    private String title;
    private String ISBN;
    private int copiesAvailable;

    public LibraryItem(String title, String ISBN, int copiesAvailable) {
        this.title = title;
        this.ISBN = ISBN;
        this.copiesAvailable = copiesAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        if (copiesAvailable >= 0) {
            this.copiesAvailable = copiesAvailable;
        }
    }

    public abstract void showDetails();
}
