package com.exercise;


public class Tools {
    Work work;
    
    public void timeTest() {
        long startTime = System.currentTimeMillis();
        work.work();
        long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + "毫秒");
    }
    
    public Work getWork() {
        return work;
    }
    
    public void setWork(Work work) {
        this.work = work;
    }
}
