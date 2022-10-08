package com.ycptu.bean;

import lombok.ToString;

@ToString
public class HuaMuLan extends HuaHu {
    public String name = "HuaMuLan";
    public int age = 19;

    public void dressing() {
        System.out.println("HuaMuLan化妆");
    }

    public static void sayMe() {
        System.out.println("大家好，我叫HuaMuLan，我今年19");
    }
}
