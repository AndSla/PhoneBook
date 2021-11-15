package com.nauka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Input {

    List<String> loadFileToMemory(File file) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader fileBr = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = fileBr.readLine()) != null) {
                lines.add(line.replaceAll("\\d+\\s", ""));
            }

        } catch (IOException e) {
            System.out.println("File not found!");
        }

        return lines;

    }

}
