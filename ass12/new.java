import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private Boolean isAvailable = true;
    private Borrower borrower;

    void setData(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    void borrowBook(Borrower borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
        } else
            System.out.println("Book already borrowed by: " + this.borrower.getBorrowerName() + "\n");
    }

    void returnBook() {
        if (isAvailable) {
            System.out.println("This book is not borrowed yet");
            return;
        }
        this.borrower = null;
        isAvailable = true;
        System.out.println("Book successfully returned\n");
    }

    void displayDetails() {
        System.out.println("\nBook title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Availabilty: " + isAvailable);
        if (!isAvailable) {
            borrower.displayBorrowerDetails();
        }
    }
}

class Borrower {
    private int borrowerId;
    private String borrowerName;

    void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    int getBorrowerId() {
        return borrowerId;
    }

    String getBorrowerName() {
        return borrowerName;
    }

    void displayBorrowerDetails() {
        System.out.println("Borrower Name: " + borrowerName);
        System.out.println("Borrower ID: " + borrowerId);
    }
}

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[4];
        Borrower[] borrowers = new Borrower[4];

        for (int i = 0; i < 4; i++) {
            books[i] = new Book();
            borrowers[i] = new Borrower();
            borrowers[i].setBorrowerId(i + 1);
        }

        books[0].setData("Sword Art Online", "Reki Kawahara");
        books[1].setData("Re:Zero − Starting Life in Another World", "Tappei Nagatsuki");
        books[2].setData("Mushoku Tensei: Jobless Reincarnation", "Rifujin na Magonote");
        books[3].setData("The Apothecary Diaries", "Hyūganatsu");

        borrowers[0].setBorrowerName("Asta");
        borrowers[1].setBorrowerName("Yuno");
        borrowers[2].setBorrowerName("Noelle");
        borrowers[3].setBorrowerName("Charmy");

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run) {
            System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("\n1. Display All Books");
            System.out.println("2. Display All Borrowers");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            int i, j;
            switch (choice) {
                case 1:
                    for (i = 0; i < 4; i++) {
                        books[i].displayDetails();
                    }
                    break;

                case 2:
                    for (i = 0; i < 4; i++) {
                        borrowers[i].displayBorrowerDetails();
                    }
                    break;

                case 3:
                    System.out.println("Enter book title: ");
                    String bookName = sc.nextLine();
                    for (i = 0; i < books.length; i++) {
                        if (books[i].getTitle().toLowerCase().contains(bookName.strip().toLowerCase())) {
                            books[i].displayDetails();
                            break;
                        }
                    }
                    if (i == books.length)
                        System.out.println("Book not present");
                    break;

                case 4:
                    System.out.println("Enter book author: ");
                    String authorName = sc.nextLine();
                    for (i = 0; i < books.length; i++) {
                        if (books[i].getAuthor().toLowerCase().contains(authorName.strip().toLowerCase())) {
                            books[i].displayDetails();
                            break;
                        }
                    }
                    if (i == books.length)
                        System.out.println("Book not present");
                    break;

                case 5:
                    System.out.println("Enter book name: ");
                    String book = sc.nextLine();
                    for (i = 0; i < books.length; i++) {
                        if (books[i].getTitle().toLowerCase().contains(book.strip().toLowerCase())) {
                            System.out.println("Enter borrower's name: ");
                            String borrowerName = sc.nextLine();
                            for (j = 0; j < borrowers.length; j++) {
                                if (borrowers[j].getBorrowerName().toLowerCase()
                                        .contains(borrowerName.strip().toLowerCase())) {
                                    books[i].borrowBook(borrowers[j]);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Enter book name: ");
                    String Book = sc.nextLine();
                    for (i = 0; i < books.length; i++) {
                        if (books[i].getTitle().toLowerCase().contains(Book.strip().toLowerCase())) {
                            books[i].returnBook();
                            break;
                        }
                    }
                    break;

                case 7:
                    run = false;
                    break;

                default:
                    break;
            }
        }
        sc.close();
    }
}