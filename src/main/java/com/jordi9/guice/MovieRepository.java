package com.jordi9.guice;

import java.util.Set;

/* 03 */
public interface MovieRepository {
  
  Set<Movie> findByCity(City city);
  
}