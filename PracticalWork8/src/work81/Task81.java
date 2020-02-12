package work81;

import java.util.Arrays;
import java.util.Scanner;

public class Task81 {

    public static void main(String[] args) {
	// write your code here
        Book[] books = createBooks();
        printBooks(books);
        updateBooks(books, 10);
        System.out.println("-----------------------------");
        printBooks(books);
        System.out.println("------------------------------");
        Scanner sc1 = new Scanner(System.in);
        String author = sc1.nextLine();
        Book[] booksAuthor = searchByAuthor(books, author);
        if (booksAuthor.length==0){
            System.out.println("Not books by this author");
        } else printBooks(booksAuthor);

        System.out.println("------------------------------");
        Scanner sc2 = new Scanner(System.in);
        String publisher = sc2.nextLine();
        Book[] booksPubslisher = searchByPublisher(books, publisher);
        if (booksAuthor.length==0){
            System.out.println("Not books by this publisher");
        } else printBooks(booksPubslisher);

        System.out.println("------------------------------");
        Scanner sc3 = new Scanner(System.in);
        int year = sc3.nextInt();
        Book[] booksYear = searchByYear(books, year);
        if (booksAuthor.length==0){
            System.out.println("Not books were released after this year");
        } else printBooks(booksYear);
    }
    public static Book[] createBooks(){
        return new Book[]
                {
        new Book(12, "run", "maslo", "word", 1999, 125, 12.0),
        new Book(13, "nigga", "maslo1", "word1", 2000, 125, 12.1),
        new Book(14, "run1", "maslo2", "word2", 1998, 125, 12.2),
        new Book(15, "run2", "maslo3", "word2", 1997, 125, 12.3),
        new Book(16, "run3", "maslo4", "word4", 1996, 125, 12.4)
                };
    }

public static void printBooks( Book[] books){
        for (Book elem:books){
            elem.viewBook();
        }
}
public static void updateBooks(Book[] books, int percent){
        for (Book elem: books){
            double cost =  elem.getCost();
            cost += cost*percent/100.0;
            elem.setCost(cost);
        }
}
public static Book[] searchByAuthor(Book[] books, String name){
        Book[] newBooks = new Book[books.length];
        int i = 0;
        for (Book elem:books){
            if (elem.getAuthor().equalsIgnoreCase(name)) {
                newBooks[i]=elem;
                i++;

            }
        }
        return Arrays.copyOf(newBooks, i);
}
public static Book[] searchByPublisher(Book[] books, String publisher){
        Book[] newBooks = new Book[books.length];
        int i = 0;
        for (Book elem:books){
            if (elem.getOublisher().equalsIgnoreCase(publisher)) {
                newBooks[i]=elem;
                i++;

            }
        }
        return Arrays.copyOf(newBooks, i);
    }
    public static Book[] searchByYear(Book[] books, int year){
        Book[] newBooks = new Book[books.length];
        int i = 0;
        for (Book elem:books){
            if (elem.getYear()>=year) {
                newBooks[i]=elem;
                i++;

            }
        }
        return Arrays.copyOf(newBooks, i);
    }


}
