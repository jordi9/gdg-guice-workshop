package com.jordi9.guice;

import static com.google.common.base.Objects.equal;

import com.google.common.base.Objects;

public class City {
  
  public String name;
  
  public City(String name) {
    this.name = name;
  }
  
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof City) {
      City that = (City) obj;
      return equal(name, that.name);
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
  
}