package com.jordi9.guice.example02;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

/**
 * This is not the real Showtimes from IMDB ;)
 */
class ImdbShowtimesUrl extends GenericUrl {

  @Key
  String q;
  
  @Key
  int json = 1;
  
  @Key
  int nr = 1;
  
  @Key
  String nm = "on";
  
  ImdbShowtimesUrl(String query) {
    super(SHOWTIMES_URL);
    this.q = query;
  }
  
  private static final String SHOWTIMES_URL = "http://www.imdb.com/xml/find";
  
}
