package com.xixi;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[13];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println("arr[i] = " + arr[i]);
            int 某变量 = 3;//wc竟然不报错666
        }
    }

    /**
     * 计算两个整型变量的和并返回
     *
     * @param x 加数x
     * @param y 加数y
     * @return 两个整型变量的和
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

}
