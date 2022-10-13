package com;

public enum Gender {
    男(1), 女(2);

    private int code;

    Gender(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
