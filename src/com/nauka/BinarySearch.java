package com.nauka;

import java.util.List;

public class BinarySearch extends SearchAlgorithm {

    @Override
    int search(List<String> searchFor, List<String> searchIn, boolean msg) {
        int count = 0;

        getStopWatch().start();

        for (String what : searchFor) {

            int left = 1;
            int right = searchIn.size();
            while (left <= right) {
                int middle = (left + right) / 2;
                if (searchIn.get(middle).equals(what)) {
                    count++;
                    break;
                } else if (searchIn.get(middle).compareTo(what) > 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

        }

        getStopWatch().stop();

        return count;

    }

}
