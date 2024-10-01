package Week40.Book;

import java.util.Scanner;

public class Book {
    private int id;
    private final String author;
    private final String title;
    private int rating;
    private final int releaseDate;
    private final String isbn;
    private final int seitenAnzahl;


    public Book(int id, String author, String title, int releaseDate, String isbn, int seitenAnzahl) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
        this.isbn = isbn;
        this.seitenAnzahl = seitenAnzahl;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
        Scanner scan = new Scanner(System.in);
        int rating = scan.nextInt();
        if (rating >= 1 && rating <= 5){
            this.rating = rating;
        } else {
            this.messenger("Not a valid rating. The rating should be between 1 and 5. Try it again: ");
            this.setRating();
        }

    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getSeitenAnzahl() {
        return seitenAnzahl;
    }

    private void messenger(String message){
        System.out.println(message);
    }
}
