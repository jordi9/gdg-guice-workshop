package com.jordi9.guice.example01;

import static com.google.common.base.Objects.equal;

import com.google.common.base.Objects;

class Movie {
  String name;
  
  Movie(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Movie) {
      Movie that = (Movie) obj;
      return equal(name, that.name);
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
  
  @Override
  public String toString() {
    return Objects
      .toStringHelper(this)
      .add("name", name)
      .toString();
  }
}