package com.exercise;


public class Main {
    public static void main(String[] args) {
        Tools tools = new Tools();
        Work work = new Work() {
            @Override
            public void work() {
                long current = 0;
                for (long i = 0; i < 100000000000000L; i++) {
                    current++;
                }
            }
        };
        tools.setWork(work);
        tools.timeTest();
    }
}
