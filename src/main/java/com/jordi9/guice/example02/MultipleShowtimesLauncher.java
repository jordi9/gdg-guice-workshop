package com.jordi9.guice.example02;

import java.util.Set;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jordi9.guice.Movie;

class MultipleShowtimesLauncher {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(
        new GoogleHttpClientModule()
        /*18*/
    );

    MultipleShowtimes showtimes = injector.getInstance(MultipleShowtimes.class);
    Set<Movie> movies = showtimes.findMovies("chicago");
    
    System.out.println("Movies found:");
    for (Movie movie : movies) {
      System.out.println("  " + movie);
    }

  }

}
 