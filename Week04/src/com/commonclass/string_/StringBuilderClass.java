package com.commonclass.string_;


public class StringBuilderClass {
    public static void main(String[] args) {

        Worker StringBuilderWorker = new Worker() {
            @Override
            public void work() {
                StringBuilder str1 = new StringBuilder();
                for (int i = 0; i < 10000; i++) {
                    str1.append(i);
                }
            }
        };

        Worker StringBufferWorker = new Worker() {
            @Override
            public void work() {
                StringBuffer str2 = new StringBuffer();
                for (int i = 0; i < 10000; i++) {
                    str2.append(i);
                }
            }
        };

        System.out.println("StringBuilder执行时间：" + new WorkTime(StringBuilderWorker).getRunTime());
        System.out.println("StringBuffer执行时间：" + new WorkTime(StringBufferWorker).getRunTime());
    }
}
//定义一个接口，表示要执行的工作
interface Worker{
    public void work();
}

class WorkTime{
    long startTime;
    long endTime;

    //采用匿名内部类的形式传入工作
    Worker worker;

    //计算工作的时间
    WorkTime (Worker worker){
        this.worker = worker;
        startTime = System.currentTimeMillis();
        worker.work();
        endTime = System.currentTimeMillis();
    }

    long getRunTime(){
        return endTime - startTime;
    }


}
