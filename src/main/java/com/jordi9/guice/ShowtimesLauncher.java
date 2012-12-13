package com.jordi9.guice;

import java.util.Set;

import com.google.inject.Guice;
import com.google.inject.Injector;

class ShowtimesLauncher {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        /*02*/ /*05*/ /*08*/ /*11*/
    );

    Showtimes showtimes = injector.getInstance(Showtimes.class);
    Set<Movie> movies = showtimes.findMovies("barcelona");

    System.out.println("Movies found:");
    for (Movie movie : movies) {
      System.out.println("  " + movie);
    }

  }

}
 