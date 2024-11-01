class Teacher extends User {
    private int borrowLimit = 5;
    private int booksBorrowed = 0;

    public Teacher(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void borrowItem(Book book) {
        if (booksBorrowed < borrowLimit && book.getCopiesAvailable() > 0) {
            booksBorrowed++;
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
            System.out.println(getName() + " (Teacher) borrowed " + book.getTitle() + ". Books left: " + book.getCopiesAvailable());
        } else {
            System.out.println(getName() + " (Teacher) cannot borrow more books.");
        }
    }
}
