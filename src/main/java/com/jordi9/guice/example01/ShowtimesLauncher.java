package com.jordi9.guice.example01;

import com.google.inject.Guice;
import com.google.inject.Injector;

class ShowtimesLauncher {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new ShowtimesModule());
    
    Showtimes showtimes = injector.getInstance(Showtimes.class);
    showtimes.run();
    
  }
}
