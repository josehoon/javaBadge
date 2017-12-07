package com.familysearch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        createLargeString();
    }

    public static void createLargeString() {
        String myStringSeed = "1234567890";
        long count = 0;

        try {
            ArrayList<String> stringList = new ArrayList<String>();
            while (true) {
                // System.out.println(Runtime.getRuntime().totalMemory() + "|");
                stringList.add(myStringSeed);
                count++;
            }
        }
        catch (OutOfMemoryError error) {
            System.out.println(error);
            System.out.println("Count = " + count);
            System.out.println("Total Char Count = " + count * 10);
            error.printStackTrace();
        }
    }
}
