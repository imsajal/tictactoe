package com.example.tictactoe.controller;


import com.example.tictactoe.dto.Turn;
import com.example.tictactoe.service.BoardService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

    public String makeMove(Turn turn, Integer xCoordinate, Integer yCoordinate){

       return boardService.makeMoveAndFindWinner(turn, xCoordinate, yCoordinate);

    }

}
