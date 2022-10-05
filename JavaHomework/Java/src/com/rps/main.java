package com.rps;

import java.util.Random;
import java.util.Scanner;

public class main {
    static int dogfall = 0;
    static int winCnt = 0;
    static int loseCnt = 0;

    public static void main(String[] args) {
        int a=1;
        a=  a++;
        System.out.println(a);
//        String shang = "下列选项中，哪一个是多行注释符号";
//        String result = "";
//
//        try {
//            result = URLEncoder.encode(shang, "GBK");
//            System.out.println("GBK:" + result);
//
//            result = URLEncoder.encode(shang, "UTF-8");
//            System.out.println("UTF8: " + result);
//
//            result = URLEncoder.encode(shang, "UTF-16");
//            System.out.println("UTF16:" + result);
//        } catch (UnsupportedEncodingException e) {
//
//            e.printStackTrace();
//        }

//        System.out.println("程序已启动\n" +
//                "剪刀 石头 布");
//        for (int i = 1; i <= 5; i++) {
//            game(i);
//            boolean a = true;
//            boolean b = false;
//            String s = "123" + "123" + "123";
//            String asd = "123" + "123" + "123" + 3;
//            System.out.println(asd);
//
//        }
    }

    /**
     * @param cnt
     */
    public static void game(int cnt) {
        System.out.println("第" + cnt + "局");
        Scanner scanner = new Scanner(System.in);
        String player = null;
        if (scanner.hasNext()) {
            player = scanner.next();
        }
        int computer = new Random().nextInt(3);
        String[] rockPaperScissors = new String[]{
                "石头", "剪刀", "布"};
        System.out.println("电脑本次出的是" + rockPaperScissors[computer]);
        if (rockPaperScissors[computer].equals(player)) {
            System.out.println("打平了");
            dogfall++;
        } else if (rockPaperScissors[computer].equals("石头")) {
            if (player.equals("剪刀")) {
                ++loseCnt;
                System.out.println("你输了");
            } else {
                ++winCnt;
                System.out.println("你赢了");//玩家出布的情况 。所有相等的情况上面判断过了已经
            }
        } else if (rockPaperScissors[computer].equals("剪刀")) {
            if (player.equals("布")) {
                loseCnt++;
                System.out.println("你输了");
            } else {
                winCnt++;
                System.out.println("你赢了");
            }
        } else if (rockPaperScissors[computer].equals("布")) {
            if (player.equals("拳头")) {
                loseCnt++;
                System.out.println("你输了");
            } else if (player.equals("剪刀")) {
                ++winCnt;
                System.out.println("你赢了");
            }
        }
        if (cnt == 5) {
            System.out.println("本次游戏您赢了" + winCnt + "局" + "平了" + dogfall + "局");
            if (winCnt == loseCnt) {
                System.out.println("平局");
            } else if (winCnt < loseCnt) {
                System.out.println("你输了");
            } else if (winCnt > loseCnt) {
                System.out.println("你赢了");
            }
        }

    }
}
