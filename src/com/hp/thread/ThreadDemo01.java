package com.hp.thread;
/*
* 线程....
*创建线程的第一种方法 缺点：直接extends
* */
public class ThreadDemo01 {
    public static void main(String[] args) {
        //创建一个线程
        Thread t1 = new HotWaterThread();//烧水的线程
        Thread t2 = new xicaiThread();//洗菜的线程
        t1.start();
        t2.start();
     //像这样的做一会烧水，做一会洗菜，那么这就叫异步,没有先后顺序，ajax异步的
        //像这样的 吧烧水全部完成，在洗菜这个叫同步，有先后顺序
    }
}
//如果只单单new thread ，它只是一个线程，线程中没有方法（任务），没意义
//需要自己创建一个线程，继承他的任务（方法）
//线程中最有意义的就是run方法
class HotWaterThread extends  Thread{
    public  void  run(){
        for(int i=0;i<10;i++){
            System.out.println("烧了"+i+"瓶水");
        }
    }
}
class xicaiThread extends  Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("洗了" + i + "菜");

        }
    }
}