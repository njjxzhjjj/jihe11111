package com.hp.thread;
/*
*线程创建最好用的  匿名内部类
* 线程创建的方式3
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread(){
            public  void run(){
                for (int i = 0; i < 10; i++) {
                    System.out.println("洗了菜" + i);

                }
            }
        }.start();
        new Thread(){
            public  void  run(){
                for(int i=0;i<10;i++){
                    System.out.println("烧了瓶水"+i);
                }
            }
        }.start();
    }
}
