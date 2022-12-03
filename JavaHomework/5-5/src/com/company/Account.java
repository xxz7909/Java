package com.company;

import java.util.regex.Pattern;

public class Account {
    private String user;
    private String password;
    private String email;
    private String phone;

    public boolean setUser(String user) {
        if (user.length() < 8)
            return false;

        this.user = user;
        return true;
    }

    public boolean setPassword(String password) {
        int length = password.length();
//        if (length < 8 || length > 16)
//            return false;
//        String regex = "^([a-z]+)([A-Z]+)([!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}]+)$";
        String regex = "^((?=.*[A-Z])(?=.*[a-z]))[~\\!@#\\$%\\^&\\*\\(\\)\\_\\+\\?\\-\\=\\.0-9A-Za-z]{8,16}";

        if (password.matches(regex)) {
            this.password = password;
            return true;
        }
        return false;
    }

    public boolean setEmail(String email) {
        String regex = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
        if (email.matches(regex)) {
            this.email = email;
            return true;
        }
        return false;
    }

    public boolean setPhone(String phone) {
        String regex = "^[1][3,4,5,7,8][0-9]{9}$";
        if (phone.matches(regex)) {
            this.phone = phone;
            return true;
        }
        return false;
    }

}
