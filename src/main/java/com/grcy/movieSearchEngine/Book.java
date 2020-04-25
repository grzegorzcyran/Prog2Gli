package com.grcy.movieSearchEngine;

import java.time.LocalDate;

public class Book extends Creation {
    private String title;
    private String author;
    private LocalDate premiereDate;

    public Book(String title, String author, LocalDate premiereDate) {
        this.title = title;
        this.author = author;
        this.premiereDate = premiereDate;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCreator() {
        return author;
    }

    @Override
    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    @Override
    public String getDescriptionData() {
        return this.title + " " + this.author + " " + this.premiereDate;
    }

}
