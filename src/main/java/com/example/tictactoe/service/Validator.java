package com.example.tictactoe.service;

public interface Validator {

    public boolean validateMove(Integer boardSize, Integer xCoordinate, Integer yCoordinate);
}
