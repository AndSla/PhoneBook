package com.nauka;

import java.util.HashSet;
import java.util.List;

public class HashTableSearch {

    StopWatch stopWatch = new StopWatch();

    int search(List<String> searchFor, HashSet<String> searchIn) {
        int count = 0;

        stopWatch.start();

        for (String s : searchFor) {
            if (searchIn.contains(s)) {
                count++;
            }
        }

        stopWatch.stop();

        return count;
    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

}
