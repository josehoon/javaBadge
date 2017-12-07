package com.familysearch;

public class ParameterPassing {

    public static void changeParameters(int x, Banana banana1, final Banana finalBanana1) {
        x = 2;
        banana1.taste = "Sweet";
        finalBanana1.taste = "Really sweet";
        //finalBanana1 = banana1;
    }

    static class Banana {
        String taste;
    }

    public static void main(String[] args) {
        ParameterPassing parameterPassing = new ParameterPassing();

        int x = 1;
        Banana banana = new Banana();
        Banana finalBanana = new Banana();
        System.out.println("Original values: " + x + ", " + banana.taste + ", " + finalBanana.taste);        // result: 1, null, null

        banana.taste = "Sour";
        finalBanana.taste = "Really sour";
        System.out.println("Setting default values: " + x + ", " + banana.taste + ", " + finalBanana.taste); // result: 1, Sour, Really sour

        parameterPassing.changeParameters(3, banana, finalBanana);
        System.out.println("Setting values: " + x + ", " + banana.taste + ", " + finalBanana.taste);        // result: 1, Sweat, Really sweat
    }
}
