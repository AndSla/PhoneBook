package com.nauka;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File fileFind = new File("small_find.txt");
        File fileDir = new File("small_directory.txt");

        Input input = new Input();

        List<String> linesToFind = input.loadFileToMemory(fileFind);
        List<String> linesFromDir = input.loadFileToMemory(fileDir);

        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        StopWatch searchStopWatch = new StopWatch();
        StopWatch sortStopWatch = new StopWatch();
        StopWatch totalTimeStopWatch = new StopWatch();

        searchStopWatch.setStartTime("Start searching (linear search)...");
        int foundedEntries = searchAlgorithms.linearSearchAndCount(linesToFind, linesFromDir);
        searchStopWatch.setStopTime();
        searchStopWatch.printResult(foundedEntries);

        sortStopWatch.setStartTime("Start searching (bubble sort + jump search)...");
        List<String> sortedLinesFromDir = sortingAlgorithms.bubbleSort(linesFromDir);
        sortStopWatch.setStopTime();

        searchStopWatch.setStartTime();
        foundedEntries = searchAlgorithms.jumpSearchAndCount(linesToFind, sortedLinesFromDir);
        searchStopWatch.setStopTime();

        sortStopWatch.printResult("Sorting time:");
        searchStopWatch.printResult("Searching time:");

    }

}
