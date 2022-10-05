package com.goods;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Goods {
    private String name = "商品";
    private double price;

    public Goods() {
    }


    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
