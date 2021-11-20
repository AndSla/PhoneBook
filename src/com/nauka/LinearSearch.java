package com.nauka;

import java.util.List;

class LinearSearch extends SearchAlgorithm {

    @Override
    int search(List<String> searchFor, List<String> searchIn, boolean printMsg) {
        int count = 0;

        getStopWatch().start();

        if (printMsg) {
            System.out.println("Start searching (linear search)...");
        }

        for (String what : searchFor) {
            for (String where : searchIn) {
                if (where.equals(what)) {
                    count++;
                }
            }
        }

        getStopWatch().stop();

        return count;
    }

}
