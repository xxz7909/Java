package com.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderItem {
    String bookId;
    int num;

    public String getBookName(Book book) {
        return book.getName();
    }
}
