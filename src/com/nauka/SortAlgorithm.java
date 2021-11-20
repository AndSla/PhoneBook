package com.nauka;

import java.util.List;

abstract class SortAlgorithm {
    private final StopWatch stopWatch = new StopWatch();
    protected List<String> sortedList;
    private boolean tooLong = false;

    abstract List<String> sort(List<String> listToSort, long time);

    StopWatch getStopWatch() {
        return stopWatch;
    }

    List<String> getSortedList() {
        return sortedList;
    }

    void setSortedList(List<String> sortedList) {
        this.sortedList = sortedList;
    }

    public boolean isTooLong() {
        return tooLong;
    }

    public void setTooLong(boolean tooLong) {
        this.tooLong = tooLong;
    }
}
