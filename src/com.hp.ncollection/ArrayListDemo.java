package com.hp.ncollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaochan=new Person();
        diaochan.setAge(18);
        diaochan.setHeight(123);
        diaochan.setName("貂蝉");

        Person xiaoqiao=new Person();
        xiaoqiao.setAge(19);
        xiaoqiao.setHeight(173);
        xiaoqiao.setName("小乔");

        Person songshangxiang=new Person();
        songshangxiang.setAge(20);
        songshangxiang.setHeight(173);
        songshangxiang.setName("宋尚祥");

        //需求：有个曹操 ，需要一个String集合，设置集合中的值是提取与上面3000个list中的值，把这几个的名字存进去，
        List<Person> list=new ArrayList();
          list.add(diaochan);
          list.add(xiaoqiao);
          list.add(songshangxiang);
        System.out.println("list = " + list);

        List<String> names=new ArrayList<>();
        //1、遍历list集合  ，拿出对象的names付给新的names集合中
        /*for (Person s : list) {
            String name=s.getName();
            names.add(name);
        }
        System.out.println("names = " + names);
*/
          //2jdk8
        List<String> namelist = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("namelist = " + namelist);
    }
}
