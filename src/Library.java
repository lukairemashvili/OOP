import java.util.ArrayList;

class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addBook(Book book) {
        items.add(book);
        System.out.println("Added " + book.getTitle() + " to the library.");
    }

    public void borrowBook(User user, Book book) {
        user.borrowItem(book);
    }
}
