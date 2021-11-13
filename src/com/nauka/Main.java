package com.nauka;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File fileFind = new File("find.txt");
        File fileDir = new File("directory.txt");
        LinearSearch linearAlgorithm = new LinearSearch(fileFind, fileDir);
        StopWatch stopWatch = new StopWatch();

        stopWatch.setStartTime();
        int entries = linearAlgorithm.searchAndCount();
        stopWatch.setStopTime();
        stopWatch.printResult(entries);

    }

}
