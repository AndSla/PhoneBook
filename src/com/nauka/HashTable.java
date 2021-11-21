package com.nauka;

import java.util.HashSet;
import java.util.List;

public class HashTable {

    HashSet<String> hashedPhoneBook = new HashSet<>();
    StopWatch stopWatch = new StopWatch();

    public HashTable(List<String> linesFromPhoneBook) {

        stopWatch.start();

        System.out.println("\n" + "Start searching (hash table)...");
        hashedPhoneBook.addAll(linesFromPhoneBook);

        stopWatch.stop();

    }

    public StopWatch getStopWatch() {
        return stopWatch;
    }

    public HashSet<String> getHashedPhoneBook() {
        return hashedPhoneBook;
    }
}
