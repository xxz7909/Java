package com.util;

import com.model.Book;

public class utils {
    public static void printInfo(Book book) {
        System.out.println(book.getId() + '\t' + book.getName() + "   " + book.getPrice() + '\t' + book.getStorage());
    }

}
