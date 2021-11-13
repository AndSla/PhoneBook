package com.nauka;

public class StopWatch {
    private long startTime;
    private long stopTime;

    void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    void setStopTime() {
        this.stopTime = System.currentTimeMillis();
    }

    long getMin(){
        return (stopTime - startTime) / 60000;
    }

    long getSec(){
        return ((stopTime - startTime) - getMin() * 60000) / 1000;
    }

    long getMillis(){
        return (stopTime - startTime) - getMin() * 60000 - getSec() * 1000;
    }

    void printResult(int entries){
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

}
