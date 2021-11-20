package com.nauka;

import java.util.ArrayList;
import java.util.List;

public class QuickSort extends SortAlgorithm {

    private boolean start = true;

    @Override
    List<String> sort(List<String> listToSort, long time) {

        if (start) {
            getStopWatch().start();
            System.out.println("\n" + "Start searching (quick sort + binary search)...");
            start = false;
        }

        if (listToSort.size() <= 1) {

            return listToSort;

        } else {

            String pivot = listToSort.get(listToSort.size() - 1);
            List<String> leftList = new ArrayList<>();
            List<String> rightList = new ArrayList<>();
            List<String> sortedList = new ArrayList<>();

            for (int i = 0; i < listToSort.size() - 1; i++) {
                if (listToSort.get(i).compareTo(pivot) < 0) {
                    leftList.add(listToSort.get(i));
                } else {
                    rightList.add(listToSort.get(i));
                }
            }

            getStopWatch().stop();

            if ((getStopWatch().getTime() > 10 * time)) {
                setTooLong(true);
            } else {
                sortedList.addAll(sort(leftList, time));
                sortedList.add(pivot);
                sortedList.addAll(sort(rightList, time));
            }

            getStopWatch().stop();
            return sortedList;

        }

    }

}
