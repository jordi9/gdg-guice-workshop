package com.jordi9.guice;

import java.util.Set;

public class Showtimes {

  private final MovieRepository repository;

  /*01*/
  Showtimes(MovieRepository repository) {
    this.repository = repository;
  }
  
  public Set<Movie> findMovies(String city) {
    return repository.findByCity(new City(city));
  }
  
}
