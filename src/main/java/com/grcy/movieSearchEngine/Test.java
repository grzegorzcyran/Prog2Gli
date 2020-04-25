package com.grcy.movieSearchEngine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Testosteron", "Tomasz Konecki, Andrzej Saramonowicz", LocalDate.parse("2007-03-02"));
        Movie movie2 = new Movie("Lejdis", "Tomasz Konecki, Andrzej Saramonowicz", LocalDate.parse("2008-02-01"));
        Movie movie3 = new Movie("Chłopaki nie płaczą", "Olaf Lubaszenko", LocalDate.parse("2000-02-25"));
        Movie movie4 = new Movie("Poranek kojota", "Olaf Lubaszenko", LocalDate.parse("2001-08-24"));

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        SearchEngine engine = new SearchEngine(movies);
        System.out.println(engine.printCreationInfo("Lejdis"));
        System.out.println(engine.printCreationInfo("E=mc2"));

        System.out.println(engine.printCreationInfoOptional("Testosteron"));
        System.out.println(engine.printCreationInfoOptional("Fuks"));

        System.out.println(engine.printCreationInfoException("Poranek kojota"));
        System.out.println(engine.printCreationInfoException("Sztos"));

        System.out.println("=============");
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Czarownik Iwanow", "Andrzej Pilipiuk", LocalDate.parse("2012-03-02"));
        Book book2 = new Book("Achaja", "Andrzej Ziemiański", LocalDate.parse("2008-03-02"));
        Book book3 = new Book("Czysty kod", "Robert Martin", LocalDate.parse("2005-03-02"));
        Book book4 = new Book("Symfonia C++", "Jerzy Grębosz", LocalDate.parse("1996-03-02"));
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        SearchEngine engine4Books = new SearchEngine(books);
        System.out.println(engine4Books.printCreationInfo("Achaja"));
        System.out.println(engine4Books.printCreationInfo("Pasja C++"));


        System.out.println("======================");
        System.out.println("List unsorted:");
        movies.forEach(
                element -> System.out.println(element.getDescriptionData()));

        System.out.println("======================");
        movies.forEach(System.out::println);

        System.out.println("======================");
        books.forEach(el -> System.out.println(el.getDescriptionData()));

        System.out.println("======================");
        books.forEach(System.out::println);


        System.out.println("======================");
        System.out.println("List sorted by premiere date:");
        Collections.sort(movies, new MovieByPremiereDate());
        movies.forEach(x -> System.out.println(x.getDescriptionData()));

        System.out.println("======================");
        System.out.println("List sorted natural:");
        Collections.sort(movies);
        movies.forEach(x -> System.out.println(x.getDescriptionData()));



/*
        System.out.println("======================");
        System.out.println("List sorted by title:");
        movies.sort(Comparator.comparing(Movie::getTitle));
        movies.forEach(x -> System.out.println(x.getDescriptionData()));

        System.out.println("======================");
        System.out.println("List sorted by director and title:");
        movies.sort(Comparator.comparing(Movie::getCreator).thenComparing(Movie::getTitle));
        movies.forEach(x -> System.out.println(x.getDescriptionData()));

        //sortowanie książek: 1: po autorze, 2 : po autorze i dacie wydania
        System.out.println("======================");
        System.out.println("Books sorted by athor:");
        books.sort(Comparator.comparing(Book::getCreator));
        books.forEach(x -> System.out.println(x.getDescriptionData()));

        System.out.println("======================");
        System.out.println("Books sorted by author and date:");
        books.sort(Comparator.comparing(Book::getCreator).thenComparing(Book::getPremiereDate));
        books.forEach(x -> System.out.println(x.getDescriptionData()));
*/
    }
}
