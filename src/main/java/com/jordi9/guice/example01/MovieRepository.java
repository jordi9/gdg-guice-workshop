package com.jordi9.guice.example01;

import java.util.Set;

interface MovieRepository {
  Set<Movie> findByCity(City city);
}