package com.hp.nio;
/*
* file 的其他
* */
import java.io.File;
public class IoliuDemo2 {
    public static void main(String[] args) {
        //创建文件夹，所有IO底层都不是  Java操作
        File file=new File("io");
        if(!file.exists()){
            file.mkdir();//不加s 只能1层  ，加s可以多层，一般使用s

        }else {
            System.out.println("文件已经存在");
        }
        File file1=new File("io1/io2/io3/io4");
        if(!file.exists()){
            file.mkdirs();//不加s 只能1层  ，加s可以多层，一般使用s

        }else {
            System.out.println("文件已经存在");
        }
    }
}
