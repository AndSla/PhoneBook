package com.nauka;

import java.io.File;
import java.util.List;

public class SearchAlgorithms {
    List<String> whatList;
    List<String> whereList;
    Input input = new Input();

    public SearchAlgorithms(File findWhat, File findWhere) {
        whatList = input.loadFileToMemory(findWhat);
        whereList = input.loadFileToMemory(findWhere);
    }

    int linearSearchAndCount() {
        int count = 0;

        System.out.println("Start searching...");

        for (String what : whatList) {
            for (String where : whereList) {
                if (where.equals(what)) {
                    count++;
                }
            }
        }

        return count;

    }

}
