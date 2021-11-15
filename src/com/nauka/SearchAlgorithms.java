package com.nauka;

import java.util.List;

public class SearchAlgorithms {

    int linearSearchAndCount(List<String> whatList, List<String> whereList) {
        int count = 0;

        for (String what : whatList) {
            for (String where : whereList) {
                if (where.equals(what)) {
                    count++;
                }
            }
        }

        return count;

    }

    int jumpSearchAndCount(List<String> whatList, List<String> whereList) {
        int count = 0;

        return count;

    }


}
