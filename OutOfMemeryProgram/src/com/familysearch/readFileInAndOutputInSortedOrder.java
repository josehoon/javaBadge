package com.familysearch;

import java.io.*;
import java.util.*;

public class readFileInAndOutputInSortedOrder {
    private static String filePath = "c:\\Users\\josehoon\\Documents\\GitHub\\JavaBadge\\OutOfMemeryProgram\\src\\com\\familysearch\\";

    public static void main(String[] args) {
        String fileName = filePath + "inputFile.txt";

        readFileIn(fileName);
        readFileInAndSortByFirstWord(fileName);
        readFileInAndReverseSortByFirstWord(fileName);
        readFileInAndSortByFirstWordUsingCollection(fileName);
    }

    public static void readFileIn(String fileName) {
        String line = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath + "outputFileDuplicate.txt")));
            while((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileInAndSortByFirstWord(String fileName) {
        TreeSet<String> treeSet = new TreeSet<String>();
        String line = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            while((line = br.readLine()) != null) {
                treeSet.add(line);
            }
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "outputFileSortByTree.txt"));
            for(String writeLine : treeSet) {
                bw.write(writeLine);
                bw.newLine();
            }
            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileInAndReverseSortByFirstWord(String fileName) {
        TreeSet<String> reverseTreeSet = new TreeSet<String>();
        String line = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            while((line = br.readLine()) != null) {
                reverseTreeSet.add(line);
            }
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

        Set<String> reverseSet = reverseTreeSet.descendingSet();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "outputFileReverseSortByTree.txt"));
            for(String writeLine : reverseSet) {
                bw.write(writeLine);
                bw.newLine();
            }
            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFileInAndSortByFirstWordUsingCollection(String fileName) {
        ArrayList<String> sortedArrayList = new ArrayList<>();
        String line = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            while((line = br.readLine()) != null) {
                sortedArrayList.add(line);
            }
            br.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

        Collections.sort(sortedArrayList);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "outputFileReverseSortByTreeUsingCollectionSort.txt"));
            for(String writeLine : sortedArrayList) {
                bw.write(writeLine);
                bw.newLine();
            }
            bw.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
