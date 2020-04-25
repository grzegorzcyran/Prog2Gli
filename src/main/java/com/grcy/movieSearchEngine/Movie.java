package com.grcy.movieSearchEngine;

import java.time.LocalDate;

public class Movie {
    private String title;
    private String director;
    private LocalDate premiereDate;

    public Movie(String title, String director, LocalDate premiereDate) {
        this.title = title;
        this.director = director;
        this.premiereDate = premiereDate;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return director;
    }

    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public String getDescriptionData() {
        return this.title + " " + this.director + " " + this.premiereDate;
    }

}
