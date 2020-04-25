package com.grcy.movieSearchEngine;

import java.util.List;
import java.util.Optional;

public class SearchEngine<E extends Creation> {
    private List<E> creations;

    public SearchEngine(List<E> creations) {
        this.creations = creations;
    }

    private E searchCreation(String title) {
        return creations.stream()
                .filter(c -> c.getTitle().equals(title))
                .findAny()
                .orElse((E) Creation.DEFAULT_CREATION);
    }

    public String printCreationInfo(String title) {
        E creation = searchCreation(title);
        //if("".equals(creation.getTitle())) {
        if(Creation.DEFAULT_CREATION == creation) {
            return "Creation not found";
        }
        return creation.getTitle() + " " + creation.getCreator() + " " + creation.getPremiereDate();
    }



    private Optional<E> searchCreationOptional(String title) {
        return creations.stream()
                .filter(seek -> seek.getTitle().equals(title))
                .findAny();
    }

    public String printCreationInfoOptional(String title) {
        Optional<E> creation = searchCreationOptional(title);
        if(creation.isPresent()) {
            //creation.get pobiera zawartość optionala
            return creation.get().getTitle() + " " + creation.get().getCreator() + " " + creation.get().getPremiereDate();
        }
        return "Movie not found";
    }


    private E searchCreationException (String title) throws CreationNotFoundException {
        return creations.stream()
                .filter(seek -> seek.getTitle().equals(title))
                .findAny()
                .orElseThrow(CreationNotFoundException::new);
    }

    public String printCreationInfoException(String title) {
        try {
            E creation = searchCreationException(title);
            return creation.getTitle() + " " + creation.getCreator() + " " + creation.getPremiereDate();
        } catch (CreationNotFoundException e) {
            return "Creation not found";
        }

    }








}
