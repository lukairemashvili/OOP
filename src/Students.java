class Student extends User {
    private int borrowLimit = 3;
    private int booksBorrowed = 0;

    public Student(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void borrowItem(Book book) {
        if (booksBorrowed < borrowLimit && book.getCopiesAvailable() > 0) {
            booksBorrowed++;
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
            System.out.println(getName() + " (Student) borrowed " + book.getTitle() + ". Books left: " + book.getCopiesAvailable());
        } else {
            System.out.println(getName() + " (Student) cannot borrow more books.");
        }
    }
}
