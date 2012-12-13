package com.jordi9.guice.example02;

import static com.google.common.base.Throwables.propagate;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.util.Key;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.jordi9.guice.City;
import com.jordi9.guice.Movie;
import com.jordi9.guice.MovieRepository;

/**
 * This is not the real Showtimes from IMDb ;)
 * We're just querying IMDb using name search.
 * 
 * <p>
 * You can find more at <a href="http://bit.ly/RqHjod">Stack Overflow</a>
 */
class ImdbMovieRepository implements MovieRepository {

  private final HttpRequestFactory requestFactory;

  @Inject
  ImdbMovieRepository(/*09*/ /*13*/ HttpRequestFactory requestFactory) {
    this.requestFactory = requestFactory;
  }

  @Override
  public Set<Movie> findByCity(City city) {
    ImdbResponse results;
    try {
      HttpRequest request = requestFactory.buildGetRequest(new ImdbShowtimesUrl(city.name));
      results = request.execute().parseAs(ImdbResponse.class);
    } catch (IOException e) {
      throw propagate(e);
    }
    
    Set<Movie> movies = Sets.newHashSet();
    buildMovies(results.namePopular, movies);
    buildMovies(results.nameApprox, movies);
    return movies;
  }

  private void buildMovies(List<FakeShowtime> fakeShowtimes, Set<Movie> movies) {
    if(fakeShowtimes != null) {
      for(FakeShowtime fakeShowtime : fakeShowtimes) {
        movies.add(new Movie(fakeShowtime.name + " - " + fakeShowtime.description));
      }
    }
  }
  
  public static class ImdbResponse {
    
    @Key("name_popular")
    List<FakeShowtime> namePopular;
    
    @Key("name_approx")
    List<FakeShowtime> nameApprox;
    
  }
  
  public static class FakeShowtime {
    @Key
    String id, title, name, description;
  }
  
}