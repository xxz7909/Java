package com.goods;

public class util {
    public static void print(String one, String two, String three, String four, String five, String six) {
        System.out.println(one + '\t' + '\t' + two + '\t' + three + '\t' + four + '\t' + '\t' + five + '\t' + '\t' + six);
    }

    public static void printHomeworkTwo(Goods goods, int balance) {
        int count = (int) (balance / goods.getPrice());
        balance %= goods.getPrice();
        System.out.println("购买完书本后还可以购买" + goods.getName() + count + "个，还剩" + balance + "元");
    }

    public static void printHomeworkThree(Goods goods, int count) {
        System.out.println("你购买了" + goods.getName() + count + "只,需要花费" + goods.getPrice() * count + "元");
    }

}
