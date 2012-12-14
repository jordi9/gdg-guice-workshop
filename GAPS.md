# Fill the gaps

### Inject 101

##### 00
 
    @Inject

##### 01

	Injector injector = Guice.createInjector(new ShowtimesModule());

##### 02

    bind(MovieRepository.class).to(MovieRepositoryImpl.class);

##### 02.a

    @ImplementedBy(MovieRepositoryImpl.class)

##### 03

    given(repository.findByCity(new City("barcelona")))
    	.willReturn(ImmutableSet.of(new Movie("Blade"), new Movie("Runner")));

### Example: Google Showtimes API

##### 04

    @Inject

##### 05

    new GoogleHttpClientModule()

##### 06

    @Provides

##### 07

    @Singleton

##### 08

    bind(MovieRepository.class).to(GoogleMovieRepository.class);

### Example: IMDb suggest API

##### 09

    @Named("json")

##### 10

    @Provides @Singleton @Named("json")

##### 11

    bind(MovieRepository.class).to(ImdbMovieRepository.class);

Example queries to play with: rutger hauer, liv tyler

##### 12

    @BindingAnnotation

##### 13

    @Json

##### 14

    @Json

##### 15

    bind(HttpRequestFactory.class).annotatedWith(Json.class).toInstance(providesHttpRequestFactory());

##### 16

    bind(HttpRequestFactory.class).annotatedWith(Names.named("json")).toInstance(providesHttpRequestFactory());

### Use both APIs: Multibindings

##### 17

    @Inject

##### 18

     Multibinder<MovieRepository> multibinder = Multibinder.newSetBinder(binder(), MovieRepository.class);
     multibinder.addBinding().to(GoogleMovieRepository.class);
     multibinder.addBinding().to(ImdbMovieRepository.class);


Example queries: chicago, brooklyn, phil
