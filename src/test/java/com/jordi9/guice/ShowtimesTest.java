package com.jordi9.guice;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.jordi9.guice.Movie;
import com.jordi9.guice.MovieRepository;
import com.jordi9.guice.Showtimes;

@RunWith(MockitoJUnitRunner.class)
public class ShowtimesTest {

  //SUT
  Showtimes showtimes;
  
  @Mock MovieRepository repository;
  
  @Test
  public void run_shouldCallRepo() {
    showtimes = new Showtimes(repository);
    
    /*03*/
    
    Set<Movie> movies = showtimes.findMovies("barcelona");
    
    assertThat(movies, hasSize(2));
  }
  
}
