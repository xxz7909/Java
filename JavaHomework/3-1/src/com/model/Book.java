package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String id;
    private String name;
    private double price;
    private int storage;

    public void setPrice(double price) {
        if (price < 0.00) {
            this.price = 0;
        }
        this.price = price;
    }

    public void setStorage(int storage) {
        if (storage < 0) {
            this.storage = 0;
        }
        this.storage = storage;
    }

    @Override
    public String toString() {
        return id + '\t' + name +"    " + price + '\t' + storage ;
    }

}