package com.nauka;

import java.util.List;

public class SearchAlgorithms {
    private final StopWatch stopWatch = new StopWatch();

    int linearSearchAndCount(List<String> whatList, List<String> whereList) {
        int count = 0;

        stopWatch.start("Start searching (linear search)...");

        for (String what : whatList) {
            for (String where : whereList) {
                if (where.equals(what)) {
                    count++;
                }
            }
        }

        stopWatch.stop();

        return count;

    }

    int blockSearchAndCount(List<String> whatList, List<String> whereList) {
        int count = 0;
        int blockSize = (int) Math.floor(Math.sqrt(whereList.size()));
        int prevJ = 0;

        stopWatch.start();

        for (String what : whatList) {
            for (int j = 0; j < whereList.size(); j++) {
                if (whereList.get(j).equals(what)) {
                    count++;
                } else if (whereList.get(j).compareTo(what) < 0) {
                    for (int k = j; k > prevJ; k--) {
                        if (whereList.get(k).equals(what)) {
                            count++;
                        }
                    }
                } else {
                    prevJ = j;
                    if (j + blockSize > whereList.size()) {
                        j = whereList.size() - 1;
                    } else {
                        j += blockSize;
                    }
                }
            }
        }

        stopWatch.stop();

        return count;

    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

}
