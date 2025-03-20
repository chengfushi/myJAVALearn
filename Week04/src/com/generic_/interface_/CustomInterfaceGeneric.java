package com.generic_.interface_;


public class CustomInterfaceGeneric {
    public static void main(String[] args) {

        IA ia = new IA() {
            @Override
            public Integer get(String s) {
                System.out.println(s);
                return 100;
            }
        };

    }
}


interface IUsb<U,R> {

    R get(U u);

}

interface IA extends IUsb<String,Integer> { }
