package com.hp.nio;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
* 文件的拷贝  (不重要了解)
* */
public class IODemoCopy01 {
    public static void main(String[] args) throws IOException {
        //拷贝文件
        RandomAccessFile copytarget = new RandomAccessFile("javaapi.zip", "r");
        RandomAccessFile secondName = new RandomAccessFile("javaapi副本.zip", "rw");

        int d = -1; //io/ 里面-1就是代表着读取完毕
        while (true) {

            if ((d = copytarget.read()) != -1) {
                secondName.write(d);
            }
        }
    }
}
