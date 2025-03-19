package com.collection_.vector;


import java.util.Vector;

public class VectorClassUse {
    public static void main(String[] args) {
        Vector vector = new Vector();

        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

        System.out.println(vector);
    }
}
