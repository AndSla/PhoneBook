package com.nauka;

import java.io.File;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        File fileFind = new File("find.txt");
        File filePhoneBook = new File("directory.txt");

        Input input = new Input();
        List<String> linesToFind = input.loadFileToMemory(fileFind);
        List<String> linesFromPhoneBook = input.loadFileToMemory(filePhoneBook);

        SearchAlgorithm linear = new LinearSearch();
        SearchAlgorithm block = new BlockSearch();
        SearchAlgorithm binary = new BinarySearch();
        SortAlgorithm bubble = new BubbleSort();
        SortAlgorithm quick = new QuickSort();

//      LinearSearch
        int foundedEntries = linear.search(linesToFind, linesFromPhoneBook, true);
        linear.getStopWatch().printResult(foundedEntries);
        long time = linear.getStopWatch().getTime();

        StopWatch totalTime = new StopWatch();

//      BubbleSort + BlockSearch
        totalTime.start();

        bubble.setSortedList(bubble.sort(linesFromPhoneBook, time));
        String message = "";
        if (bubble.isTooLong()) {
            message = " - STOPPED, moved to linear search";
            foundedEntries = linear.search(linesToFind, linesFromPhoneBook, false);
        } else {
            foundedEntries = block.search(linesToFind, bubble.getSortedList(), false);
        }

        totalTime.stop();

        totalTime.printResult(foundedEntries);
        bubble.getStopWatch().printResult("Sorting time:", message);
        if (bubble.isTooLong()) {
            linear.getStopWatch().printResult("Searching time:", "");
        } else {
            block.getStopWatch().printResult("Searching time:", "");
        }

//      QuickSort + BinarySearch
        totalTime.start();

        quick.setSortedList(quick.sort(linesFromPhoneBook, time));
        message = "";
        if (quick.isTooLong()) {
            message = " - STOPPED, moved to linear search";
            foundedEntries = linear.search(linesToFind, linesFromPhoneBook, false);
        } else {
            foundedEntries = binary.search(linesToFind, quick.getSortedList(), false);
        }

        totalTime.stop();

        totalTime.printResult(foundedEntries);
        quick.getStopWatch().printResult("Sorting time:", message);
        if (quick.isTooLong()) {
            linear.getStopWatch().printResult("Searching time:", "");
        } else {
            binary.getStopWatch().printResult("Searching time:", "");
        }

//      HashTable
        totalTime.start();

        HashTable hashTable = new HashTable(linesFromPhoneBook);
        HashTableSearch hash = new HashTableSearch();
        foundedEntries = hash.search(linesToFind, hashTable.getHashedPhoneBook());

        totalTime.stop();

        totalTime.printResult(foundedEntries);
        hashTable.getStopWatch().printResult("Creating time:", "");
        hash.getStopWatch().printResult("Searching time:", "");

    }

}
