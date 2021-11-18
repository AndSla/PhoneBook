package com.nauka;

import java.util.List;

abstract class SortAlgorithm {
    private final StopWatch stopWatch = new StopWatch();
    protected List<String> sortedList;

    abstract boolean sort(List<String> listToSort, long time);

    StopWatch getStopWatch() {
        return stopWatch;
    }

    List<String> getSortedList() {
        return sortedList;
    }

    public void setSortedList(List<String> sortedList) {
        this.sortedList = sortedList;
    }
}
