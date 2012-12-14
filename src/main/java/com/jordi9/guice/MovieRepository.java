package com.jordi9.guice;

import java.util.Set;

/*02.a*/
public interface MovieRepository {
  
  Set<Movie> findByCity(City city);
  
}