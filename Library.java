import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    private class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void printBookTitle() {
            System.out.println(this.title);
        }
    }

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void printList() {

        int index = 0;

        while (index < books.size()) {
            Book bookName = books.get(index);
            bookName.printBookTitle();
            index++;
        }   
    }

    public static void main(String[] args) {
        Library lib1 = new Library();
        lib1.addBook("HP");
        lib1.addBook("ji");
        lib1.printList();

    }
}