package com.hp.thread;
/*
* 线程的阻塞
* 举例：项目中的例子：
* 河南电信。。。。1000张电话卡---->中国电信
* 1826784586235
* 2471438528784
* 12647365962984683295
* 72472154819
* */
public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++) {
            //阻塞sleep
            Thread.sleep(2);
            System.out.println("访问中国电信" + i+"次");
        }
        //其实main 方法就是一个线程，是一个主线程
        Thread thread=Thread.currentThread();//拿到当前的线程
        String name=thread.getName();//线程的名字
        System.out.println("name = " + name);
        long id = thread.getId();//线程的唯一id
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon();//是否是守护线程
        System.out.println("daemon = " + daemon);

        int priority = thread.getPriority();//线程的优先级
        System.out.println("priority = " + priority);

        boolean alive = thread.isAlive();//线程是否活着
        System.out.println("alive = " + alive);


    }
}
