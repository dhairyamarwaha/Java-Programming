import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        Library library = new Library("Library", 50000);
        Library.Book book = library.new Book("Harry Potter","J.K Rowling", 650);

        while(true){

            System.out.println("====Library Management System====");
            System.out.println("1. Add book");
            System.out.println("2. Search Book");
            System.out.println("3. Update price");
            System.out.println("4. Display all details");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter book title : ");
                    String title = sc.nextLine();
                    System.out.print("Enter author name : ");
                    String author = sc.nextLine();
                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    library.addBook(title,author,price);
                    System.out.println("Book added successfully\n");
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter the book you wish to search for : ");
                    String toSearch = sc.nextLine();

                    library.searchBook(toSearch);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter the title of the book : ");
                    String bookTitle = sc.nextLine();
                    System.out.print("Enter the new price of the book : ");
                    double newPrice = sc.nextDouble();
                    library.updatePrice(bookTitle,newPrice);
                    break;

                case 4:
                    sc.nextLine();
                    library.displayAllBooks();
                    break;
                default:
                    return;
            }
        }

    }
}

class Library {
    private String libraryName;
    private int maxBookcount;
    private int bookCount;
    Book[] books;

    Library(String libraryName, int maxBookcount) {
        this.libraryName = libraryName;
        this.maxBookcount = maxBookcount;
        this.bookCount = 0;
        books = new Book[maxBookcount];
    }

    class Book {
        private String booktitle;
        private String author;
        public double price;

        Book(String booktitle, String author, double price) {
            this.booktitle = booktitle;
            this.author = author;
            this.price = price;
        }

        void updatePrice(double newPrice) {
            price = newPrice;
        }

    }

    void addBook(String title, String author, double price) {
        if (bookCount < maxBookcount) {
            books[bookCount] = new Book(title, author, price);
            bookCount++;
        } else {
            System.out.println("Library is full");
            return;
        }
    }

    void searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (title.equalsIgnoreCase(books[i].booktitle)) {
                System.out.println("\nBook found");
                System.out.println("Book title : " + title);
                System.out.println("Book Author : " + books[i].author);
                System.out.println("Book price : " + books[i].price);
                break;
            } else {
                System.out.println("Book not found");
            }
        }
    }
    void displayAllBooks(){
        for (int i = 0; i < bookCount; i++){
            System.out.println("\nBook title : " + books[i].booktitle);
            System.out.println("Book Author : " + books[i].author);
            System.out.println("Book price : " + books[i].price);
            System.out.println("");
        }
    }
    void updatePrice(String title, double newPrice){
        for (int i = 0; i < bookCount; i++) {
            if(title.equalsIgnoreCase(books[i].booktitle)){
                books[i].updatePrice(newPrice);
                System.out.println("\nPrice updated successfully\n");
            }
        }
        System.out.println("Book not found");
    }
}