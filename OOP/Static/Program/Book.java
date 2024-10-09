public class Book {
    private String bookName;
    private boolean isLent;

    static int totalLent = 0;

    Book(String bookName) {
        this.bookName = bookName;
        this.isLent = false;
    }

    public void lendBook() {
        if(isLent) {
            System.out.println(bookName + " Book is already lent." );
            return;
        } else {
            isLent = true;
            System.out.println(bookName + " Book is successfully lent.");
            totalLent++;
        }

    }

    public void returnBook() {
        if (!isLent) {
            System.out.println(bookName + " Book is already returned");
            return;
        } else {
            isLent = false;
            System.out.println(bookName + " Book successfully returned.");
            totalLent--;
        }
    }

}
