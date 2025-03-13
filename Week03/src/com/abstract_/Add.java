package com.abstract_;

public class Add extends Tool{

    @Override
    public void code() {
        long current = 0;
        for (long i = 0; i < 1000000L; i++) {
            for (int j = 0; j < 100000L; j++){
                current++;
            }
        }
    }
}
