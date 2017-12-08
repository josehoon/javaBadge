package com.familysearch.InstanceOfSample;

public class Volkswagen extends MyInstanceOf.Car {

  public Volkswagen(String name, String color) {
    super(name, color);
  }

  //@overload method
  public void drive() {
    System.out.println("I can drive faster than a car because I am an orvedrive Volkswagen.");
  }
}
