package com.grcy.movieSearchEngine;

import java.util.List;
import java.util.Optional;

public class SearchEngine {
    private List<Movie> creations;

    public SearchEngine(List<Movie> movies) {
        this.creations = movies;
    }

    private Movie searchMovie(String title) {
        return creations.stream()
                .filter(movie -> movie.getTitle().equals(title))
                .findAny()
                .orElse(new Movie("", "", null));

    }

    public String printMovieInfo(String title) {
        Movie movie = searchMovie(title);
        if("".equals(movie.getTitle())) {
            return "Movie not found";
        }
        return movie.getTitle() + " " + movie.getCreator() + " " + movie.getPremiereDate();
    }



    private Optional<Movie> searchMovieOptional(String title) {
        return creations.stream()
                .filter(seek -> seek.getTitle().equals(title))
                .findAny();
    }

    public String printMovieInfoOptional(String title) {
        Optional<Movie> movie = searchMovieOptional(title);
        if(movie.isPresent()) {
            //movie.get pobiera zawartość optionala
            return movie.get().getTitle() + " " + movie.get().getCreator() + " " + movie.get().getPremiereDate();
        }
        return "Movie not found";
    }


    private Movie searchMovieException (String title) throws MovieNotFoundException {
        return creations.stream()
                .filter(seek -> seek.getTitle().equals(title))
                .findAny()
                .orElseThrow(MovieNotFoundException::new);
    }

    public String printMovieInfoException(String title) {
        try {
            Movie creation = searchMovieException(title);
            return creation.getTitle() + " " + creation.getCreator() + " " + creation.getPremiereDate();
        } catch (MovieNotFoundException e) {
            return "Movie not found";
        }

    }








}
