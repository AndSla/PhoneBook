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

        SearchAlgorithms search = new SearchAlgorithms();
        SortingAlgorithms sorting = new SortingAlgorithms();

        StopWatch searchStopWatch = search.getStopWatch();
        StopWatch sortingStopWatch = sorting.getStopWatch();
        StopWatch totalTimeStopWatch = new StopWatch();

        System.out.println("Start searching (linear search)...");
        int foundedEntries = search.linearSearchAndCount(linesToFind, linesFromDir);
        searchStopWatch.printResult(foundedEntries);
        long time = searchStopWatch.getStopTime() - searchStopWatch.getStartTime();

        boolean takesTooLong = sorting.bubbleSort(linesFromDir, time);
        String message = "";
        if (takesTooLong) {
            message = " - STOPPED, moved to linear search";
            foundedEntries = search.linearSearchAndCount(linesToFind, linesFromDir);
        } else {
            foundedEntries = search.blockSearchAndCount(linesToFind, sorting.getSortedList());
        }

        totalTimeStopWatch.setStartTime(sortingStopWatch.getStartTime());
        totalTimeStopWatch.setStopTime(searchStopWatch.getStopTime());
        totalTimeStopWatch.printResult(foundedEntries);

        sortingStopWatch.printResult("Sorting time:", message);
        searchStopWatch.printResult("Searching time:", "");

    }

}
