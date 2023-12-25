package com.example.tictactoe.enums;

import lombok.val;

public enum Symbol {
    UNDERSCORE("_"),CROSS("X"),ZERO("O");

    private String value;

    Symbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
