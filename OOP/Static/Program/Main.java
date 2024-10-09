public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Shyamchi aai");
        Book b2 = new Book("Mahabharat");
        Book b3 = new Book("Ramayan");

        b1.lendBook();
        b2.lendBook();
        b3.lendBook();

        System.out.println("Total book lent = "+ Book.totalLent);

        b1.returnBook();

        System.out.println("Total book lent = "+ Book.totalLent);
    }
}