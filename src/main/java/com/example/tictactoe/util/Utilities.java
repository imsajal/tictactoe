package com.example.tictactoe.util;

import com.example.tictactoe.dto.Turn;
import com.example.tictactoe.model.Board;
import com.example.tictactoe.model.Player;

import static com.example.tictactoe.constants.TicTacToeConstants.WIN_MESSAGE;
import static com.sun.javafx.css.SizeUnits.TURN;

public class Utilities {

    public static void printBoard(Board board){

        for(int i =0 ; i< board.getBoard().length ; i++){

            for(int j =0 ; j< board.getBoard().length ; j++)
                System.out.println(board.getBoard()[i][j]);

        }
    }

    public static void announceTurn(String playerName){

        System.out.println(TURN + playerName);
    }

    public static void announceWinner(String playerName) {

        System.out.println(playerName + WIN_MESSAGE);

    }


}
