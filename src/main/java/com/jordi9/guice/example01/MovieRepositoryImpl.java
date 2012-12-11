package com.jordi9.guice.example01;

import java.util.Set;

import com.google.common.base.Splitter;
import com.google.common.collect.Sets;

class MovieRepositoryImpl implements MovieRepository {

  @Override
  public Set<Movie> findByCity(City city) {
    Set<Movie> movies = Sets.newHashSet();
    
    Iterable<String> letters = Splitter.fixedLength(1).split(city.name);
    for (String letter : letters) {
      movies.add(new Movie(letter.toUpperCase()));
    }
    
    return movies;
  }
  
}