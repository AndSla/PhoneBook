package com.nauka;

import java.io.*;
import java.util.Scanner;

public class LinearSearch {
    File findWhat;
    File findWhere;

    public LinearSearch(File findWhat, File findWhere) {
        this.findWhat = findWhat;
        this.findWhere = findWhere;
    }

    int searchAndCount() {
        int count = 0;

        System.out.println("Start searching...");

        try {
            BufferedReader whatBr = new BufferedReader(new FileReader(findWhat));
            BufferedReader whereBr = new BufferedReader(new FileReader(findWhere));

            while (whatBr.readLine() != null) {
                String what = whatBr.readLine();

                while (whereBr.readLine() != null) {
                    String where = whereBr.readLine();
                    where = where.replaceAll("\\d+\\s", "");

                    if (where.equals(what)) {
                        count++;
                        System.out.println(count);
                    }

                }

                whereBr = new BufferedReader(new FileReader(findWhere));

            }

        } catch (IOException e) {
            System.out.println("File not found!");
        }

        return count;

    }

}
