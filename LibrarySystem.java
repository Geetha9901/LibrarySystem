import java.util.*;

class Book {
    int id;
    String title, author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Book\n2. Search Book\n3. Display Books\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(id, title, author));
                    break;
                case 2:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Book b : books) {
                        if (b.id == searchId) {
                            System.out.println("Found: " + b.title + " by " + b.author);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Book not found.");
                    break;
                case 3:
                    System.out.println("\n--- Library Books ---");
                    for (Book b : books) {
                        System.out.println(b.id + " - " + b.title + " by " + b.author);
                    }
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
