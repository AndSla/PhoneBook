package com.nauka;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File fileFind = new File("small_find.txt");
        File fileDir = new File("small_directory.txt");
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms(fileFind, fileDir);
        StopWatch stopWatch = new StopWatch();

        stopWatch.setStartTime();
        int entries = searchAlgorithms.linearSearchAndCount();
        stopWatch.setStopTime();
        stopWatch.printResult(entries);

    }

}
