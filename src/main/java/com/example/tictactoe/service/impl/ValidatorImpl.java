package com.example.tictactoe.service.impl;

import com.example.tictactoe.service.Validator;

public class ValidatorImpl implements Validator {


    @Override
    public boolean validateMove(Integer boardSize, Integer xCoordinate, Integer yCoordinate) {

        return xCoordinate >= 0 && xCoordinate < boardSize
                && yCoordinate >= 0 && yCoordinate < boardSize;
    }
}
