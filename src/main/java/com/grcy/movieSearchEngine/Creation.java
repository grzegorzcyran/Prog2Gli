package com.grcy.movieSearchEngine;


import java.time.LocalDate;

public abstract class Creation {
    public static Creation DEFAULT_CREATION;

    public abstract String getTitle();

    public abstract String getCreator();

    public abstract LocalDate getPremiereDate();

    public abstract String getDescriptionData();
}
