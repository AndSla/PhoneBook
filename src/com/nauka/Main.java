package com.nauka;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File fileFind = new File("small_find.txt");
        File filePhoneBook = new File("small_directory.txt");

        Input input = new Input();
        List<String> linesToFind = input.loadFileToMemory(fileFind);
        List<String> linesFromPhoneBook = input.loadFileToMemory(filePhoneBook);

        SearchAlgorithm linear = new LinearSearch();
        SearchAlgorithm block = new BlockSearch();
        SortAlgorithm bubble = new BubbleSort();

        StopWatch totalTime = new StopWatch();

        int foundedEntries = linear.search(linesToFind, linesFromPhoneBook, true);
        linear.getStopWatch().printResult(foundedEntries);
        long time = linear.getStopWatch().getTime();

        totalTime.start();

        boolean takesTooLong = bubble.sort(linesFromPhoneBook, time);
        String message = "";
        if (takesTooLong) {
            message = " - STOPPED, moved to linear search";
            foundedEntries = linear.search(linesToFind, linesFromPhoneBook, false);
        } else {
            foundedEntries = block.search(linesToFind, bubble.getSortedList(), false);
        }

        totalTime.stop();

        totalTime.printResult(foundedEntries);
        bubble.getStopWatch().printResult("Sorting time:", message);
        linear.getStopWatch().printResult("Searching time:", "");

    }

}
