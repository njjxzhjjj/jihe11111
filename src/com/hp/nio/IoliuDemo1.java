package com.hp.nio;

import java.io.File;
import java.io.IOException;

/*
* file 文件
*   file文件你真行，可读可写可执行
* */
public class IoliuDemo1 {
    public static void main(String[] args) {
        File file=new File("io01.txt");

        //创建新文件
        /*try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            System.out.println("不能创建新文件");
            e.printStackTrace();
        }*/
        //查看文件是否存在，一定要有个这个代码，不然文件会覆盖
        boolean exists = file.exists();//判断问价是否存在
        if(exists){
            System.out.println("文件已存在，boolean 值 ="+exists);
        }else{
            System.out.println("文件不存在，boolean 值 ="+exists);
            boolean create = false;
            try {
                create = file.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件创建成功 " + create);
        }
        boolean isfile = file.isFile();
        System.out.println("是否是文件" + isfile);

        boolean isdirectory = file.isDirectory();
        System.out.println("是否是目录 " + isdirectory);

        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件" + hidden);

        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);

        long length = file.length();
        System.out.println("length = " + length);

        //文件的删除
        if(exists){
            System.out.println("文件存在了 删除");
                    file.delete();
        }

    }
}
