package com.nauka;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("find.txt");
        int count = 0;
        long startTime = System.currentTimeMillis();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        long endTime = System.currentTimeMillis();

        long min = (endTime - startTime) / 60000;
        long sec = ((endTime - startTime) - min * 60000) / 1000;
        long millis = (endTime - startTime) - min * 60000 - sec * 1000;

        System.out.println("Start searching...");

        String result = "Found " +
                count +
                " / " +
                count +
                " entries. Time taken: " +
                min +
                " min. " +
                sec +
                " sec. " +
                millis +
                " ms.";

        System.out.println(result);

    }

}
