package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private static Integer orderId = 0;
    private static double total;
    private static String items[];
    Book[] books;

    public void setOrder(){}


    public  void setOrderId() {
        orderId++;
    }

    public String getOrderId(){
        return "图书订单号:0000"+orderId.toString();
    }


}
