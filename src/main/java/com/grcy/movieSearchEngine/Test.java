package com.grcy.movieSearchEngine;

import java.time.LocalDate;
import java.util.ArrayList;
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
        System.out.println(engine.printMovieInfo("Lejdis"));
        System.out.println(engine.printMovieInfo("E=mc2"));

    }
}
