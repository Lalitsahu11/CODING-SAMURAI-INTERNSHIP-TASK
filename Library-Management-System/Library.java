import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("\nID | Title | Author | Status");
        for (Book b : books) {
            b.displayBook();
        }
    }

    void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available or invalid ID.");
    }

    void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid book ID.");
    }
}
