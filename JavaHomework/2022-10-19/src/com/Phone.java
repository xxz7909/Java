package com;

public class Phone {
    private String brand;
    private String type;
    private String OS;
    private int price;
    private int RAM;

    public Phone(String brand, String type, String OS, int price, int RAM) {
        this.brand = brand;
        this.type = type;
        this.OS = OS;
        this.price = price;
        this.RAM = RAM;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "品牌:" + brand + '\n' +
                "型号:" + type + '\n' +
                "操作系统:" + OS + '\n' +
                "价格:" + price +'\n'+
                "内存:" + RAM;
    }

    public void dial(String phone) {
        System.out.println("使用自动拨号功能:" + phone + "的号");
    }

    public void playGame() {
        System.out.println("玩扫雷游戏");
    }

    public void playMP3(String songName) {
        System.out.println("播放歌曲:" + songName);
    }

}