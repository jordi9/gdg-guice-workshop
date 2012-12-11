package com.jordi9.guice.example01;

import java.util.Set;

import com.google.inject.Inject;

class Showtimes {

  MovieRepository repository;

  @Inject
  Showtimes(MovieRepository repository) {
    this.repository = repository;
  }
  
  void run() {
    Set<Movie> results = repository.findByCity(new City("barcelona"));
    System.out.println("Movies found:");
    for (Movie movie : results) {
      System.out.println("  " + movie);
    }
  }
  
}
