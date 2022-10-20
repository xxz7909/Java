package com;

public class Demo {

    public static void main(String[] args) {
        Phone apple = new Phone("苹果", "iphoneX", "ios", 8888, 16);
        System.out.println(apple.toString());
        System.out.println();
        apple.dial("爷爷");
        apple.playGame();
        apple.playMP3("我的中国心");
        System.out.println("************");

        Phone huawei = new Phone("华为","华为荣耀20","Android",6666,16);
        System.out.println(huawei.toString());
        huawei.dial("奶奶");
        huawei.playGame();
        huawei.playMP3("北京欢迎你");

    }
}
