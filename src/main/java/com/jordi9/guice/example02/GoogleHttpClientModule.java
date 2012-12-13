package com.jordi9.guice.example02;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.xml.XmlNamespaceDictionary;
import com.google.api.client.xml.XmlObjectParser;
import com.google.inject.AbstractModule;

public class GoogleHttpClientModule extends AbstractModule {

  private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
  private static final JsonFactory JSON_FACTORY = new JacksonFactory();
  private static final XmlNamespaceDictionary DICTIONARY = new XmlNamespaceDictionary().set("", "");
  
  @Override
  protected void configure() {
    /*15*/ /*16*/
  }

  /*06*/ /*07*/
  public HttpRequestFactory providesHttpRequestFactory() {
    return HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
      @Override
      public void initialize(HttpRequest request) {
        request.setParser(new XmlObjectParser(DICTIONARY));
      }
    });
  }

  /*10*/ /*14*/
  public HttpRequestFactory providesHttpRequestFactoryWithJsonParser() {
    return HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
      @Override
      public void initialize(HttpRequest request) {
        request.setParser(new JsonObjectParser(JSON_FACTORY));
      }
    });
  }

}
