package com.hp.dudizhu;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*
* 斗地主  模拟 洗牌
* 牌数 ：54张，大王，小王，1-k
* ♥  ♦
 * */
public class DouDiZhuTest {
    public static void main(String[] args) {
        //1、先造出4个花色

        ArrayList<String> colors = new ArrayList<>();
        colors.add("♥");//红心♥
        colors.add("♠");//黑桃♠
        colors.add("♣ ");//梅花♣
        colors.add("♦");//方块♦

        //2、造出10个  2-10
        ArrayList<String> numbers = new ArrayList<>();
        for (int i=2;i<=10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //3、上面是  colors和number进行一个整合
        //放入到一个  新的集合中 如何做到呢？ 嵌套循环
       ArrayList<String> piker = new ArrayList<>();
       // Set<String> piker = new HashSet();
        for (String color : colors) {
            for (String number : numbers) {
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("LittleKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
        //如果使用 set也是无法分开排序的,改为list，有个方法可以，打乱他的排序，只能打断list
        //因set 无序的
        Collections.shuffle(piker);//打断list的排序
        System.out.println("piker = " + piker);
        /*Collections.sort(piker);//list的快速排序（不是人工指定的）
        System.out.println("piker = " + piker);*/

        //给player1  player2 player3发牌
        ArrayList<String> player1 = new ArrayList<>();//玩家1
        ArrayList<String> player2 = new ArrayList<>();//玩家2
        ArrayList<String> player3 = new ArrayList<>();///玩家3
        ArrayList<String> dipai = new ArrayList<>();//底牌
        for (int i=0;i<piker.size();i++) {
            String pName=piker.get(i);//每张扑克牌
            if (i>=51){
                dipai.add(pName);//埋最后三张底牌
            }else{
                //给玩家1，2，3发前面 51张牌
                if(i%3==0){
                    player1.add(pName);
                }else if(i%3==1){
                    player2.add(pName);
                }else {
                    player3.add(pName);
                }
            }
        }
        System.out.println("dipai = " + dipai);
        System.out.println("player1 = " + player1);
        System.out.println("player1 = " + player1.size());//size集合中长度
        System.out.println("player2 = " + player2);
        System.out.println("player2 = " + player2.size());//size集合中长度
        System.out.println("player3 = " + player3);
        System.out.println("player3 = " + player3.size());//size集合中长度


        // 规定个地主,  规定 谁摸到红桃3 谁是地主,  注意:  底牌里面不能包含红桃3
        for (String s : dipai) {
            if (s.equals("♥3")) {
                System.out.println("底牌有红桃三,请重新洗牌");
            }
        }

        for (String s : player1) {
            if (s.equals("♥3")) {
                String aa="玩家1是地主";
                System.out.println("player1" + aa);
            }
        }
        for (String s : player2) {
            if (s.equals("♥3")) {
                String aa="玩家2是地主";
                System.out.println("player2" + aa);
            }
        }
        for (String s : player3) {
            if (s.equals("♥3")) {
                String aa="玩家3是地主";
                System.out.println("player3" + aa);
            }
        }
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        if (ss.equals("1")){
            player1.add(dipai.get(0));
            player1.add(dipai.get(1));
            player1.add(dipai.get(2));

        }else if (ss.equals("2")) {
            player2.add(dipai.get(0));
            player2.add(dipai.get(1));
            player2.add(dipai.get(2));

        }else if (ss.equals("3")) {
            player3.add(dipai.get(0));
            player3.add(dipai.get(1));
            player3.add(dipai.get(2));
        }
        Collections.sort(piker);//排序  sort
        System.out.println("piker=" + piker);
        System.out.println("dipai = " + dipai);
    }
}
