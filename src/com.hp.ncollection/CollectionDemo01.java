package com.hp.ncollection;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合  有一个接口  collection  接口可以继承接口
* length（）方法  没有泛型的类
* size（）放很多东西  list.add(23)
* 集合可以转为数组
* */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        //ArrayList c1 = new ArrayList();
        //add 添加
        c1.add("唐曾----执着的目标");
        c1.add("吉吉国王----过硬技术");
        c1.add("猪八戒----老色皮，体贴关心");
        c1.add("臭鱼----稳重的劳动");
        c1.add("白龙马----面几");
        System.out.println("c1 = " + c1);

        //尺寸
        int size=c1.size();
        System.out.println("size = " + size);
        boolean empty = c1.isEmpty();
        System.out.println("empty = " + empty);

        //集合清除
        //c1.clear();
        System.out.println("c1 = " + c1);
        boolean empty1 = c1.isEmpty();
        System.out.println("empty1 = " + empty1);

        //集合的遍历
        //one
        for (int i=0;i<c1.size();i++) {
            System.out.println("c1[i]" + ((ArrayList) c1).get(i));
        }
        //因为set集合没有索引下标,所以for循环不能使用到collection中
        for (Object o : c1) {
            System.out.println("o = " + o);
        }
        //迭代器   和for循环的区别
        //迭代器工作：有游标  ，有没有一个元素，如果有，就拿出，没有就结束
        //for循环的工作  把集合从0-N排序
    }
}
