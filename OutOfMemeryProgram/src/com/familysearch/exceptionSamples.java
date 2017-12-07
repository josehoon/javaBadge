package com.familysearch;

import java.io.*;

public class exceptionSamples {

    public static void main(String[] args) throws IOException {
        // run the below method one at a time
        uncheckedErrorSample_1();
        uncheckedErrorSample_2();
        checkedErrorSample_1();
        checkedErrorSample_2();
    }

    public static void uncheckedErrorSample_1() {
        int x = 0;
        int y = 10;
        int z = y/x;
    }

    public static void uncheckedErrorSample_2() throws IOException {
        int array[] = {1, 2, 3, 4, 5};
        System.out.println(array[4]); //works
        System.out.println(array[5]); // null pointer
    }

    public static void checkedErrorSample_1() throws IOException {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
           System.out.println(fileInput.readLine());

        fileInput.close();
    }

    public static void checkedErrorSample_2() throws IOException {
        try {
            FileReader file = new FileReader("C:\\test\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            fileInput.close();
        } catch(IOException e) {
            e.printStackTrace();
            throw (e);
        }

    }
}
