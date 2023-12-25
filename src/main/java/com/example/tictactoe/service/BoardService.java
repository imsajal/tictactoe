package com.example.tictactoe.service;

import com.example.tictactoe.dto.Turn;

public interface BoardService {
    String makeMoveAndFindWinner(Turn turn, Integer xCoordinate, Integer yCoordinate);

}
