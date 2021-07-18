package com.hp.thread;

/**
 * 测试 电脑 能开多少个线程
 */
public class TestHowManyThead {
    public static int i=0;
    public static void main(String[] args) {
            while (true){
             Thread t = new XiCaiThread1();
             t.start();
                System.out.println(i++);
            }
    }
}
class XiCaiThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}