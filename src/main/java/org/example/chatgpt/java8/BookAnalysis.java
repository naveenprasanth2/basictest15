package org.example.chatgpt.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookAnalysis {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 4.9),
                new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "Fantasy", 4.8),
                new Book("The Catcher in the Rye", "J.D. Salinger", "Classics", 3.9),
                new Book("To Kill a Mockingbird", "Harper Lee", "Classics", 4.3),
                new Book("1984", "George Orwell", "Dystopia", 4.7),
                new Book("Brave New World", "Aldous Huxley", "Dystopia", 4.0),
                new Book("Animal Farm", "George Orwell", "Dystopia", 4.5)
        );

        Map<String, List<Book>> booksByGenre = books.stream().collect(Collectors.groupingBy(Book::genre));

        Map<String, Optional<Book>> topAuthorsByGenre = books.stream().collect(Collectors.groupingBy(Book::genre,
                Collectors.maxBy(Comparator.comparingDouble(Book::rating))));

        Map<Boolean, List<Book>> highlyRatedBooks = books.stream()
                .collect(Collectors.partitioningBy(x -> x.rating() >= 4));

        // 4. Flatten and list all distinct genres
        List<String> distinctGenres = books.stream()
                .map(Book::genre)
                .distinct()
                .toList();

// Output the results
        System.out.println("Books by Genre:");
        booksByGenre.forEach((genre, genreBooks) -> {
            System.out.printf("Genre: %s%n", genre);
            genreBooks.forEach(book -> System.out.printf("\t%s by %s (Rating: %.1f)%n", book.title(), book.author(), book.rating()));
        });

        System.out.println("\nTop Author by Genre:");
        topAuthorsByGenre.forEach((genre, author) -> {
            System.out.printf("Genre: %s, Top Author: %s%n", genre, author
                    .orElse(new Book("", "", "", 0)));
        });

        System.out.println("\nHighly Rated Books:");
        highlyRatedBooks.get(true).forEach(book -> System.out.printf("%s by %s (Rating: %.1f)%n", book.title(), book.author(), book.rating()));

        System.out.println("\nOther Books:");
        highlyRatedBooks.get(false).forEach(book -> System.out.printf("%s by %s (Rating: %.1f)%n", book.title(), book.author(), book.rating()));

        System.out.println("\nDistinct Genres:");
        System.out.println(distinctGenres);
    }
}
