package com.familysearch.InstanceOfSample;

public class MyInstanceOf {

  public static class Car {
    private String name;
    private String color;
    private int modelYear;

    // constructor overloading example
    public Car(String name) {
      this.name = name;
    }

    public Car(String name, String color, int modelYear) {
      this.name = name;
      this.color = color;
      this.modelYear = modelYear;
    }

    public Car(String name, String color) {
      this.name = name;
      this.color = color;
    }

    public void drive() {
      System.out.println("I can drive as a regular car.");
    }

    public void drive(int speedInMiles) {
      System.out.println("I can drive as a regular car with " + speedInMiles + " miles.");
    }

    public void drive(String name, String color, int modelYear) {
      System.out.println("I can drive " + color + " " + name + " made in " + modelYear + ".");
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

    // overriding method
    System.out.print("*****************************************\n");
    Car newBeetle = new Car("newBeetle", "Yellow");
    newBeetle.drive();

    Car newJetta = new Volkswagen("newJetta", "Yellow");
    newJetta.drive();

    // overloading method
    System.out.print("*****************************************\n");
    Car overloadCar = new Car("junk Chevy Truck", "Gray", 1910);
    overloadCar.drive("Chevy Truck", "Gary", 1910);
  }
}
