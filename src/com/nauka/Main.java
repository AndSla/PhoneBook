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

        SearchAlgorithms linearSearch = new SearchAlgorithms();
        SearchAlgorithms blockSearch = new SearchAlgorithms();
        SortingAlgorithms bubbleSort = new SortingAlgorithms();

        StopWatch linearSearchStopWatch = linearSearch.getStopWatch();
        StopWatch blockSearchStopWatch = blockSearch.getStopWatch();
        StopWatch bubbleSortStopWatch = bubbleSort.getStopWatch();
        StopWatch totalTimeStopWatch = new StopWatch();

        int foundedEntries = linearSearch.linearSearchAndCount(linesToFind, linesFromDir);
        linearSearchStopWatch.printResult(foundedEntries);

        List<String> sortedLinesFromDir = bubbleSort.bubbleSort(linesFromDir);
        foundedEntries = blockSearch.blockSearchAndCount(linesToFind, sortedLinesFromDir);
        totalTimeStopWatch.setStartTime(bubbleSortStopWatch.getStartTime());
        totalTimeStopWatch.setStopTime(blockSearchStopWatch.getStopTime());
        totalTimeStopWatch.printResult(foundedEntries);

        bubbleSortStopWatch.printResult("Sorting time:");
        blockSearchStopWatch.printResult("Searching time:");

    }

}
