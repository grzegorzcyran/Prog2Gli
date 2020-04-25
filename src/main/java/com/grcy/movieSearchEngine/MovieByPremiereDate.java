package com.grcy.movieSearchEngine;

import java.util.Comparator;

public class MovieByPremiereDate implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getPremiereDate().compareTo(movie2.getPremiereDate());
    }
}
