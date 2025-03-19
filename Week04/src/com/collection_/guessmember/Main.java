package com.collection_.guessmember;
/*
* 实现一个抽奖程序，70几率抽中男生，30几率抽中女生*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List listMan = new ArrayList();
        Collections.addAll(listMan,"男1","男2","男3","男4","男5","男6","男7");

        List listWoman = new ArrayList();
        Collections.addAll(listWoman,"女1","女2","女3");

        Random random = new Random();

        if (random.nextBoolean()){
            System.out.println(listMan.get(random.nextInt(listMan.size())));
        }else {
            System.out.println(listWoman.get(random.nextInt(listWoman.size())));
        }
    }
}
