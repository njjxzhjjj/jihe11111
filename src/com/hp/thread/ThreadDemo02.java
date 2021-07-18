package com.hp.thread;
/*
* 创建线程的第二种方法，不用继承，用实现
* */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xicai=new xicai();
        Runnable HotWater=new HotWater();

        Thread xicaiThread =new Thread(xicai);
        Thread HotWaterThread =new Thread(HotWater);
        xicaiThread.start();
        HotWaterThread.start();

    }
}
class  xicai implements Runnable{
    public void  run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("洗了" + i + "菜");

        }
    }
}
    class HotWater implements Runnable{
public  void  run(){
        for(int i=0;i<10;i++){
        System.out.println("烧了"+i+"瓶水");
        }
    }
}