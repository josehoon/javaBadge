package com.familysearch.sharedComponent;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OverloadExample {

    public static void main(String[] args) {
        Fruits fruits_1 = new Fruits("Fuji", "Red", 1, 3);
        fruits_1.getName();
        Apple apple = new Apple("Gala", "Green");
        if(apple.getSweetness()) {
            System.out.println("It is sweet : " + apple.getSweetness());
        }
    }

    public static class Fruits {
        private String name;
        private String color;
        private int weight;
        private int size;
        private boolean sweetness;
        private Calendar harvestDate = null;

        public Fruits(String name) {
            this.name = name;
            System.out.println("Name : " + name);
            System.out.println("1111111111111111111111111111111111");
        }

        public Fruits(String name, String color) {
            this(name);
            this.color = color;
            System.out.println("Name : " + name);
            System.out.println("Color : " + color);
            System.out.println("2222222222222222222222222222222222");
        }

        public Fruits(String name, String color, int weight, int size) {
            this.name = name;
            this.color = color;
            this.weight = weight;
            this.size = size;
            System.out.println("Name : " + name);
            System.out.println("Color : " + color);
            System.out.println("Weight : " + weight);
            System.out.println("Size : " + size);
            System.out.println("3333333333333333333333333333333333");
        }

        public String getName() {
            System.out.println(this.name);
            return this.name;
        }

        public void getColor() {
            System.out.println(this.color);
        }

        public void getWeight() {
            System.out.println(this.weight);
        }

        public void getSize() {
            System.out.println(this.size);
        }

        public boolean getSweetness() {
            return this.sweetness;
        }

        String getHarvestDateString() {
            if (harvestDate == null) {
                return "None";
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm:ss");
            return dateFormat.format(harvestDate.getTime());
        }

        void harvestFruits(Calendar harvestDate) {
            if (harvestDate == null) {
                this.harvestDate = Calendar.getInstance();
            }
            else {
                this.harvestDate = harvestDate;
            }
        }
    }

    public static class Apple extends Fruits {

        public Apple(String name, String color) {
            super(name, color);
            super.sweetness = true;
        }
    }

}
