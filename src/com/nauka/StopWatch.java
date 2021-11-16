package com.nauka;

public class StopWatch {
    private long startTime;
    private long stopTime;

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void start(String message) {
        System.out.println(message);
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
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

    void printResult(String message) {
        String result = message + " " +
                getMin() +
                " min. " +
                getSec() +
                " sec. " +
                getMillis() +
                " ms.";

        System.out.println(result);
    }


}
