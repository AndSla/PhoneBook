package com.nauka;

public class StopWatch {
    private long startTime;
    private long stopTime;

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    long getMin() {
        return (stopTime - startTime) / 60000;
    }

    long getSec() {
        return ((stopTime - startTime) - getMin() * 60000) / 1000;
    }

    long getMillis() {
        return (stopTime - startTime) - getMin() * 60000 - getSec() * 1000;
    }

    void printResult(int entries) {
        String result = "Found " +
                entries +
                " / " +
                entries +
                " entries. Time taken: " +
                getMin() +
                " min. " +
                getSec() +
                " sec. " +
                getMillis() +
                " ms.";

        System.out.println(result);
    }

    void printResult(String message1, String message2) {
        String result = message1 + " " +
                getMin() +
                " min. " +
                getSec() +
                " sec. " +
                getMillis() +
                " ms." + message2;

        System.out.println(result);
    }

    long getTime() {
        return stopTime - startTime;
    }

}
