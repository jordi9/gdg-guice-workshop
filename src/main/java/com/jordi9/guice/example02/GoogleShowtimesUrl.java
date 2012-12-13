package com.jordi9.guice.example02;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

class GoogleShowtimesUrl extends GenericUrl {

  @Key
  String movies;
  
  /**
   * 0 = today
   * 1 = tomorrow
   * 2 = day after tomorrow
   */
  @Key
  int date = 0;
  
  GoogleShowtimesUrl(String movies) {
    super(SHOWTIMES_URL);
    this.movies = movies;
  }
  
  private static final String SHOWTIMES_URL = "http://www.google.com/ig/api";
  
}
