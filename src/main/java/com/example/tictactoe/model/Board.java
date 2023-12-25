package com.example.tictactoe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Board {
    private String board[][];
    private Integer cells;
}
