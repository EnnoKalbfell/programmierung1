package Week40.Book;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book(
                1,
                "Friedrich Dürrenmatt",
                "Der Richter und sein Henker",
                1998,
                "ISBN 978-3-8668-0192-9",
                230);

        Book book2 = new Book(
                2,
                "Gasser Christoph",
                "Solothurn blickt in den Abgrund",
                2023,
                "ISBN 466-5-8668-0192-4",
                340);

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());

        System.out.println("Set rating: ");
        book1.setRating();
        System.out.println(book1.getRating());

        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());

        System.out.println("Set rating: ");
        book2.setRating();
        System.out.println(book2.getRating());

    }
}
