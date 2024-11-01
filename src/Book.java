class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String title, String ISBN, int copiesAvailable, String author, String genre) {
        super(title, ISBN, copiesAvailable);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + getTitle() + ", ISBN: " + getISBN() + ", Author: " + author + ", Genre: " + genre + ", Copies: " + getCopiesAvailable());
    }
}
