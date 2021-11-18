package com.nauka;

import java.util.List;

public class BubbleSort extends SortAlgorithm {

    @Override
    boolean sort(List<String> listToSort, long time) {
        boolean repeat = true;

        getStopWatch().start();

        System.out.println("\n" + "Start searching (bubble sort + jump search)...");

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

            getStopWatch().stop();

            if ((getStopWatch().getTime() > 10 * time)) {
                return true;
            }

        }

        setSortedList(listToSort);

        return false;

    }

}
