import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        lib.addBook(new Book(1, "Java Basics", "James Gosling"));
        lib.addBook(new Book(2, "Data Structures", "Mark Allen"));
        lib.addBook(new Book(3, "OOP Concepts", "Bjarne Stroustrup"));

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book ID to issue: ");
                    lib.issueBook(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter book ID to return: ");
                    lib.returnBook(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
