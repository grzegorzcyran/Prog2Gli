package com.grcy.movieSearchEngine;

import java.util.List;
import java.util.Optional;

public class SearchEngine<E extends Creation> {
    private List<E> creations;

    public SearchEngine(List<E> movies) {
        this.creations = movies;
    }

    private E searchMovie(String title) {
        return creations.stream()
                .filter(movie -> movie.getTitle().equals(title))
                .findAny()
                .orElse((E) Creation.DEFAULT_CREATION);
    }

    public String printMovieInfo(String title) {
        E creation = searchMovie(title);
        if("".equals(creation.getTitle())) {
            return "Movie not found";
        }
        return creation.getTitle() + " " + creation.getCreator() + " " + creation.getPremiereDate();
    }



    private Optional<E> searchMovieOptional(String title) {
        return creations.stream()
                .filter(seek -> seek.getTitle().equals(title))
                .findAny();
    }

    public String printMovieInfoOptional(String title) {
        Optional<E> creation = searchMovieOptional(title);
        if(creation.isPresent()) {
            //creation.get pobiera zawartość optionala
            return creation.get().getTitle() + " " + creation.get().getCreator() + " " + creation.get().getPremiereDate();
        }
        return "Movie not found";
    }


    private E searchMovieException (String title) throws MovieNotFoundException {
        return creations.stream()
                .filter(seek -> seek.getTitle().equals(title))
                .findAny()
                .orElseThrow(MovieNotFoundException::new);
    }

    public String printMovieInfoException(String title) {
        try {
            E creation = searchMovieException(title);
            return creation.getTitle() + " " + creation.getCreator() + " " + creation.getPremiereDate();
        } catch (MovieNotFoundException e) {
            return "Movie not found";
        }

    }








}
