package com.hp.ncollection;

import java.util.ArrayList;

/*
 * 集合  存的 对象的什么？
 * */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Person fansisi = new Person();
        fansisi.setName("范思思");
        fansisi.setHeight(156);
        fansisi.setAge(16);
        ArrayList c = new ArrayList();
        c.add(fansisi);
        for (Object o : c) {
            System.out.println("o = " + o);
        }
        fansisi.setHeight(100);
        fansisi.setAge(20);
        fansisi.setName("宁静静");
        for (Object o : c) {
            System.out.println("o = " + o);
        }

    }
}
