package com.hp.nio;

import java.io.File;

/*
* io 能创建文件，也可以创建文件夹
* 还能查看文件
* */
public class IOselectFileDemo01 {
    private static long size;
    public static void main(String[] args) {

        //查询当前目录的所有文件
        File file = new File(".");

        //有什么方法可以，全部查看所有的文件呢？
        long size=findAll(file);
        System.out.println("size = " + size);

    }
    public static long findAll(File file){
        File[] files=file.listFiles();

        for (File file1 : files) {
            if(file1.isDirectory()){
                findAll(file1);//递归
            }else{
                System.out.println("file1 = " + file1.length());//大小
                size += file1.length();
            }
        }
        return size;
    }
}
