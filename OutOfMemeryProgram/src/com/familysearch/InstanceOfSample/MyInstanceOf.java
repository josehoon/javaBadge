package com.familysearch.InstanceOfSample;

public class MyInstanceOf {

  public static class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
      this.name = name;
      this.color = color;
    }
  }

  public static void main(String args[]) {
    Car beetle = new Volkswagen("Beetle", "Red");

    // instanceof example
    if(beetle instanceof Car) {
      System.out.println("Beetle is an instance of a Car.");
      System.out.println("Name: " + beetle.name);
      System.out.println("Color: " + beetle.color);
    } else {
      System.out.println("Beetle is NOT an instance of a Car?");
    }

    // casting example
    Volkswagen junkCar = null;
    junkCar = (Volkswagen) beetle;
    if(junkCar instanceof Car) {
      System.out.println("junkCar is a Beetle and a Car.");
      System.out.println("Name: " + ((Car) junkCar).name);
      System.out.println("Color: " + ((Car) junkCar).color);
    } else {
      System.out.println("junkCar is NOT an instance of a Car?");
    }


  }
}
