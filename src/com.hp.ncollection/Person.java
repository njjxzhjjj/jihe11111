package com.hp.ncollection;
//泛型必须要加Comparable<Person>
public class Person implements Comparable<Person>{
    private  String name;
    private int height;
    private  int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    /*//此接口是比较的接口  目前按身高排序
    @Override
    public int compareTo(Person o) {
        //按照身高排序
        //如果return  的返回值，大于0 就是自身对象大于被比较对象
       int x= this.getHeight()-o.getHeight();
        return x;
    }*/
    public int compareTo(Person a) {
        //按照年龄排序
        //如果return  的返回值，大于0 就是自身对象大于被比较对象
        int x= this.getAge()-a.getAge();
        return x;
    }
}
