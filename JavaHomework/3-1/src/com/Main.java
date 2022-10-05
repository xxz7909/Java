package com;

import com.model.Book;
import com.model.Order;
import com.model.OrderItem;
import com.util.utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Book java = new Book("1", "Java教程", 30.6, 30);
        Book jsp = new Book("2", "JSP教程", 42.1, 40);
        Book ssh = new Book("3", "SSH架构", 47.3, 15);
        showMenu(java, jsp, ssh);
        service(java, jsp, ssh);
    }

    public static void service(Book java, Book jsp, Book ssh) {
        Scanner scanner = new Scanner(System.in);
        OrderItem[] orderItem = new OrderItem[3];
        for (int i = 0; i < 3; i++) {
            orderItem[i] = new OrderItem();
        }
        Order order = new Order();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入图书编号选择图书");
            if (scanner.hasNext()) {
                orderItem[i].setBookId(scanner.next());
            }
            System.out.println("请输入购买图书数量");
            if (scanner.hasNextInt()) {
                orderItem[i].setNum(scanner.nextInt());
            }
            if (i < 2) {
                System.out.println("请继续购买图书");
            }
        }
        order.setOrderId();
        System.out.println("\t图书订单");
        System.out.println(order.getOrderId());
        System.out.println("-----------------------------");
        String[] table = new String[]{java.getName(), jsp.getName(), ssh.getName()};
        double[] price = {java.getPrice(), jsp.getPrice(), ssh.getPrice()};
        for (int i = 0; i < 3; i++) {
            System.out.println(table[i] + "    "+ orderItem[i].getNum() + '\t' + price[i]);
        }
        System.out.println("-----------------------------");
        System.out.println("订单总额:"+(java.getPrice()*orderItem[0].getNum()+jsp.getPrice()*orderItem[1].getNum()+ssh.getPrice()*orderItem[2].getNum()));
    }

    public static void showMenu(Book java, Book jsp, Book ssh) {
        System.out.println("-----------------------------");
        utils.printInfo(java);
        utils.printInfo(jsp);
        utils.printInfo(ssh);
        System.out.println("-----------------------------");
    }
}
