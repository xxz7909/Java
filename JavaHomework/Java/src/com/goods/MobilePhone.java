package com.goods;

public class MobilePhone {
    String brand;
    Double size;
    Double prize;
    String configuration;
    Integer count;
//    Double valueSum;

    MobilePhone(String brand, double size, double prize, String configuration) {
        this.brand = brand;
        this.size = size;
        this.prize = prize;
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        return "品牌型号:" + brand + '\n' +
                "尺寸:" + size + '\n' +
                "价格:" + prize + '\n' +
                "配置:" + configuration + '\n';
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public double getPrize() {
        return prize;
    }

    public String getConfiguration() {
        return configuration;
    }

}
