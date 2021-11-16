package com.nauka;

import java.util.List;

public class SortingAlgorithms {
    private final StopWatch stopWatch = new StopWatch();
    List<String> sortedList;

    public boolean bubbleSort(List<String> listToSort, long time) {

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

            stopWatch.stop();

            if ((stopWatch.getStopTime() - stopWatch.getStartTime()) > 10 * time) {
                return true;
            }

        }

        sortedList = listToSort;

        return false;

    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

    public List<String> getSortedList() {
        return sortedList;
    }
}
