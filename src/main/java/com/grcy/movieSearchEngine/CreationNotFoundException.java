package com.grcy.movieSearchEngine;

public class CreationNotFoundException extends Exception{
    public CreationNotFoundException() {
        super("Movie not found");
    }
}
