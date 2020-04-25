package com.grcy.movieSearchEngine;

public class MovieNotFoundException extends Exception{
    public MovieNotFoundException() {
        super("Movie not found");
    }
}
