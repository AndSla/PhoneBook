package com.nauka;

import java.util.List;

abstract class SearchAlgorithm {
    private final StopWatch stopWatch = new StopWatch();

    StopWatch getStopWatch() {
        return stopWatch;
    }

    abstract int search(List<String> searchFor, List<String> searchIn, boolean msg);

}
