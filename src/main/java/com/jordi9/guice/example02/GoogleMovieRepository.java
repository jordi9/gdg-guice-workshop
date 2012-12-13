package com.jordi9.guice.example02;

import static com.google.common.base.Throwables.propagate;

import java.io.IOException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.common.collect.Sets;
import com.jordi9.guice.City;
import com.jordi9.guice.Movie;
import com.jordi9.guice.MovieRepository;

/**
 * Uses a hidden Google's Showtimes API.  URLs are like
 * {@code http://www.google.com/ig/api?movies=Chicago&date=0}
 * 
 * <p>
 * More info about this can be found at 
 * <a href="http://bit.ly/VBuyTh">StackOverflow</a>
 */
class GoogleMovieRepository implements MovieRepository {

  private final HttpRequestFactory requestFactory;

  /*04*/
  GoogleMovieRepository(HttpRequestFactory requestFactory) {
    this.requestFactory = requestFactory;
  }

  @Override
  public Set<Movie> findByCity(City city) {
    String results;
    try {
      HttpRequest request = requestFactory.buildGetRequest(new GoogleShowtimesUrl(city.name));
      results = request.execute().parseAsString();
    } catch (IOException e) {
      throw propagate(e);
    }
    
    Set<Movie> movies = Sets.newHashSet();
    Pattern p = Pattern.compile("<title data=\"(.*?)\"/>");
    Matcher m = p.matcher(results);
    while(m.find()) {
      movies.add(new Movie(m.group(1)));
    }
    
    return movies;
  }
  
  
}