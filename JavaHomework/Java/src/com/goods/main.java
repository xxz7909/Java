package com.goods;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        theFirstHomework();
//        theSecondHomework();
        theThirdHomework();
    }

    public static void theFirstHomework() {
        Scanner scanner = new Scanner(System.in);
        MobilePhone huawei = new MobilePhone("华为", 5.5, 3688.88, "8+128G 全面刘海屏");
        System.out.println(huawei);
        System.out.println("请输入华为手机的库存");
        if (scanner.hasNextInt()) {
            huawei.setCount(scanner.nextInt());
        }
        Double huaweiSum = huawei.prize * huawei.count;
        System.out.println("库存华为手机的总金额为:" + huaweiSum);

        MobilePhone xiaomi = new MobilePhone("小米", 5.0, 2988.88, "4+64G 全面屏");
        System.out.println("请输入小米手机的库存");
        if (scanner.hasNextInt()) {
            xiaomi.setCount(scanner.nextInt());
        }
        Double xiaomiSum = xiaomi.prize * xiaomi.count;
        System.out.println("库存小米手机的总金额为:" + xiaomiSum);

        System.out.println("=============库存清单============");
        util.print("品牌型号", "尺寸", "价格", "配置", "库存数量", "总价");
        util.print(huawei.brand, huawei.size.toString(), huawei.prize.toString(), huawei.configuration, huawei.count.toString(), huaweiSum.toString());
        util.print(xiaomi.brand, xiaomi.size.toString(), xiaomi.prize.toString(), xiaomi.configuration, xiaomi.count.toString(), xiaomiSum.toString());

        System.out.println("总库存" + (xiaomi.count + huawei.count));
        System.out.println("库存总价" + (huaweiSum + huaweiSum));

        scanner.close();
    }

//    public static void theSecondHomework() {
//        System.out.println("书本的价格为12元,您总共有20元\n" +
//                "1.铅笔的价格为:1元\n" +
//                "2.橡皮的价格为:2元\n" +
//                "3.可乐的价格为:3元\n" +
//                "4.零食的价格为:5元\n" +
//                "请输入其他需要购买商品的序列号:");
//        Scanner scanner = new Scanner(System.in);
//
//        Goods book = new Goods("书", 12);
//        Goods pencil = new Goods("铅笔", 1);
//        Goods eraser = new Goods("橡皮", 2);
//        Goods cola = new Goods("可乐", 3);
//        Goods snacks = new Goods("零食", 5);
//        int money = 20;
//        int balance = 20 - book.getPrice();
//
//        if (scanner.hasNextInt()) {
//            int option = scanner.nextInt();
//            switch (option) {
//                default:
//                    System.out.println("请输入1-4");
//                case 1:
//                    util.printHomeworkTwo(pencil, balance);
//                    break;
//                case 2:
//                    util.printHomeworkTwo(eraser, balance);
//                    break;
//                case 3:
//                    util.printHomeworkTwo(cola, balance);
//                    break;
//                case 4:
//                    util.printHomeworkTwo(snacks, balance);
//                    break;
//            }
//        }
//
//        scanner.close();
//    }

    private static void theThirdHomework() {
        System.out.println("--------------黑马小商城-------------");
        System.out.print("1.牙刷的价格为: 8. 8元\n" +
                "2.毛巾的价格为: 10.0元\n" +
                "3.水杯的价格为: 18.8元\n" +
                "4.苹果的价格为: 12.5元\n" +
                "5.香蕉的价格为: 15.5元\n");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            buyGoods();
            System.out.println("霄要继续购买请输入Y,否则输入N");

            if (scanner.hasNext()) {
                String tag = scanner.next();
                if (tag.equals("N")) {
                    flag = false;
                }
            }
        }
        System.out.println("期待您的下次光临!");
        scanner.close();
    }

    private static void buyGoods() {
        Goods toothbrush = new Goods("牙刷", 8.8);
        Goods towel = new Goods("毛巾", 10);
        Goods waterCup = new Goods("水杯", 18.8);
        Goods apple = new Goods("苹果", 12.5);
        Goods banana = new Goods("香蕉", 15.5);

        System.out.println("请输入你需要购买商品的序列号;");
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            option = scanner.nextInt();
        }
        switch (option) {
            case 1:
                System.out.println("请输入你需要购买" + toothbrush.getName() + "的数量");
                util.printHomeworkThree(toothbrush, scanner.nextInt());
                break;
            case 2:
                System.out.println("请输入你需要购买" + towel.getName() + "的数量");
                util.printHomeworkThree(towel, scanner.nextInt());
                break;
            case 3:
                System.out.println("请输入你需要购买" + waterCup.getName() + "的数量");
                util.printHomeworkThree(waterCup, scanner.nextInt());
                break;
            case 4:
                System.out.println("请输入你需要购买" + apple.getName() + "的数量");
                util.printHomeworkThree(apple, scanner.nextInt());
                break;
            case 5:
                System.out.println("请输入你需要购买" + banana.getName() + "的数量");
                util.printHomeworkThree(banana, scanner.nextInt());
                break;
            default:
                System.out.println("请输入1-5");
        }
    }

}
