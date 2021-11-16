package com.nauka;

import java.util.List;

public class SortingAlgorithms {
    private final StopWatch stopWatch = new StopWatch();

    public List<String> bubbleSort(List<String> listToSort) {

        boolean repeat = true;

        stopWatch.start("\n" + "Start searching (bubble sort + jump search)...");

        while (repeat) {

            repeat = false;

            for (int i = 0; i < listToSort.size() - 1; i++) {
                if (listToSort.get(i).compareTo(listToSort.get(i + 1)) > 0) {
                    String temp = listToSort.get(i);
                    listToSort.set(i, listToSort.get(i + 1));
                    listToSort.set(i + 1, temp);
                    repeat = true;
                }
            }

        }

        stopWatch.stop();

        return listToSort;

    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

}
