package com.grcy.movieSearchEngine;

import java.time.LocalDate;

public class Movie extends Creation implements Comparable<Movie>{
    private String title;
    private String director;
    private LocalDate premiereDate;

    public Movie(String title, String director, LocalDate premiereDate) {
        this.title = title;
        this.director = director;
        this.premiereDate = premiereDate;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCreator() {
        return director;
    }

    @Override
    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    @Override
    public String getDescriptionData() {
        return this.title + " " + this.director + " " + this.premiereDate;
    }


    //określamy naturalne porządkowanie obiektów danej klasy
    @Override
    public int compareTo(Movie movie) {
        return this.title.compareTo(movie.getTitle());
    }
}
