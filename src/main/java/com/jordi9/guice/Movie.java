package com.jordi9.guice;

import static com.google.common.base.Objects.equal;

import com.google.common.base.Objects;

public class Movie {
  
  public String title;
  
  public Movie(String name) {
    this.title = name;
  }
  
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Movie) {
      Movie that = (Movie) obj;
      return equal(title, that.title);
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return Objects.hashCode(title);
  }
  
  @Override
  public String toString() {
    return Objects
      .toStringHelper(this)
      .add("title", title)
      .toString();
  }
}