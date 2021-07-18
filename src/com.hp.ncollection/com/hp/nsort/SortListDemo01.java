package com.hp.ncollection.com.hp.nsort;

import com.hp.ncollection.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*排序集合！！！对集合进行自然排序（从小到大）
* 他只能对list 排序，对set不可以，因为set是无序的
* */
public class SortListDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(70);
        list.add(12);
        list.add(90);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
        //纯字符串
        List<String> list1 = new ArrayList<>();
        list1.add("宁静静");
        list1.add("小宁");
        list1.add("小雪");
        list1.add("小乔");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);
        //对象的排序（应用的地方很广）对对象的某个属性
        Person p1 = new Person();
        p1.setName("小黑");
        p1.setHeight(168);
        p1.setAge(18);

        Person p2 = new Person();
        p2.setName("小白");
        p2.setHeight(160);
        p2.setAge(19);

        Person p3 = new Person();
        p3.setName("小宁");
        p3.setHeight(164);
        p3.setAge(20);

        Person p4 = new Person();
        p4.setName("小雪");
        p4.setHeight(150);
        p4.setAge(16);

        Person p5 = new Person();
        p5.setName("小舞");
        p5.setHeight(159);
        p5.setAge(21);

        List<Person> personList=new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        //会报错在实体类里面写泛型Comparable<Person>
        /*Collections.sort(personList);
        System.out.println("personList = " + personList);
*/
        Collections.sort(personList);
        Collections.reverse(personList);
        System.out.println("personList = " + personList);


    }
}
