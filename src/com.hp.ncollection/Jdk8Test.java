package com.hp.ncollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
自我学习 JDK8的新特性, 如何新的遍历 只少2个demo
 */
public class Jdk8Test {
    public static void main(String[] args) {
        Person person = new Person();
        Person zhaoliying=new Person();
        zhaoliying.setAge(33);
        zhaoliying.setHeight(168);
        zhaoliying.setName("赵丽颖");

        Person xiaoqiao=new Person();
        xiaoqiao.setAge(30);
        xiaoqiao.setHeight(173);
        xiaoqiao.setName("小乔");

        Person ningjingjing=new Person();
        ningjingjing.setAge(20);
        ningjingjing.setHeight(168);
        ningjingjing.setName("宁静静");

        List<Person> list=new ArrayList();
        list.add(zhaoliying);
        list.add(xiaoqiao);
        list.add(ningjingjing);
        System.out.println("list = " + list);
        List<String> namelist = list.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println("namelist = " + namelist);
    }
}
