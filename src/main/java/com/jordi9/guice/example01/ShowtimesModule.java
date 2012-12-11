package com.jordi9.guice.example01;

import com.google.inject.AbstractModule;

public class ShowtimesModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MovieRepository.class).to(MovieRepositoryImpl.class);
  }

}
