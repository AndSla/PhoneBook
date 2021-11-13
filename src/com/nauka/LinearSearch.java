package com.nauka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    List<String> whatList = new ArrayList<>();
    List<String> whereList = new ArrayList<>();

    public LinearSearch(File findWhat, File findWhere) {
        try (BufferedReader whatBr = new BufferedReader(new FileReader(findWhat));
             BufferedReader whereBr = new BufferedReader(new FileReader(findWhere))) {

            String what;
            String where;

            while ((what = whatBr.readLine()) != null) {
                whatList.add(what);
            }

            while ((where = whereBr.readLine()) != null) {
                where = where.replaceAll("\\d+\\s", "");
                whereList.add(where);
            }

        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }

    int searchAndCount() {
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
