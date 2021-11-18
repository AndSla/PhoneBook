package com.nauka;

import java.util.List;

public class BlockSearch extends SearchAlgorithm {

    @Override
    int search(List<String> searchFor, List<String> searchIn, boolean msg) {
        int count = 0;
        int blockSize = (int) Math.floor(Math.sqrt(searchIn.size()));
        int prevJ = 0;

        getStopWatch().start();

        for (String what : searchFor) {
            for (int j = 0; j < searchIn.size(); j++) {
                if (searchIn.get(j).equals(what)) {
                    count++;
                } else if (searchIn.get(j).compareTo(what) < 0) {
                    for (int k = j; k > prevJ; k--) {
                        if (searchIn.get(k).equals(what)) {
                            count++;
                        }
                    }
                } else {
                    prevJ = j;
                    if (j + blockSize > searchIn.size()) {
                        j = searchIn.size() - 1;
                    } else {
                        j += blockSize;
                    }
                }
            }
        }

        getStopWatch().stop();

        return count;
    }

}
