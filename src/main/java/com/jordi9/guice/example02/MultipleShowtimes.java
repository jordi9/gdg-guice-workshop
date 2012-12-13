package com.jordi9.guice.example02;

import java.util.Set;

import com.google.common.collect.Sets;
import com.jordi9.guice.City;
import com.jordi9.guice.Movie;
import com.jordi9.guice.MovieRepository;

class MultipleShowtimes {

  private final Set<MovieRepository> repositories;

  /*17*/
  MultipleShowtimes(Set<MovieRepository> repositories) {
    this.repositories = repositories;
  }
  
  public Set<Movie> findMovies(String city) {
    Set<Movie> movies = Sets.newHashSet();
    for(MovieRepository repository : repositories) {
      movies.addAll(repository.findByCity(new City(city)));
    }
    return movies;
  }
  
}
