import java.util.Scanner;
class Book {
    String title, author, isbn;
    boolean issued;
    Book(String t, String a, String i) {
        title = t; author = a; isbn = i; issued = false;
    }
    void issueBook() {
        if(!issued) { issued = true; System.out.println("Book issued: " + title); }
        else System.out.println("Already issued.");
    }
    void returnBook() {
        if(issued) { issued = false; System.out.println("Book returned: " + title); }
        else System.out.println("Not issued.");
    }
}
class EBook extends Book {
    double fileSize;
    EBook(String t, String a, String i, double f) { super(t,a,i); fileSize = f; }
    @Override
    void issueBook() {
        if(!issued) { issued=true; System.out.println("EBook issued: " + title + " (" + fileSize + "MB)"); }
        else System.out.println("Already issued.");
    }
    @Override
    void returnBook() {
        if(issued) { issued=false; System.out.println("EBook returned: " + title); }
        else System.out.println("Not issued.");
    }
}
class PrintedBook extends Book {
    int pages;
    PrintedBook(String t, String a, String i, int p) { super(t,a,i); pages = p; }
    @Override
    void issueBook() {
        if(!issued) { issued=true; System.out.println("Printed book issued: " + title + " (" + pages + " pages)"); }
        else System.out.println("Already issued.");
    }
    @Override
    void returnBook() {
        if(issued) { issued=false; System.out.println("Printed book returned: " + title); }
        else System.out.println("Not issued.");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book type (1-EBook, 2-PrintedBook): ");
        int type = sc.nextInt(); sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        Book book;
        if(type == 1) {
            System.out.print("Enter file size (MB): ");
            double size = sc.nextDouble();
            book = new EBook(title, author, isbn, size);
        } else {
            System.out.print("Enter number of pages: ");
            int pages = sc.nextInt();
            book = new PrintedBook(title, author, isbn, pages);
        }
        book.issueBook();
        book.returnBook();
        sc.close();
    }
}
class Initializer {
    static int initialValue;

    static {
        initialValue = 1000; // Static block initializes the variable
        System.out.println("Static block executed. initialValue = " + initialValue);
    }
}
