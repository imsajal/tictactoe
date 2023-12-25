package com.example.tictactoe.service.impl;

import com.example.tictactoe.dto.Turn;
import com.example.tictactoe.enums.Symbol;
import com.example.tictactoe.exceptions.ColumnAlreadyOccupiedException;
import com.example.tictactoe.model.Board;
import com.example.tictactoe.model.Player;
import com.example.tictactoe.service.BoardService;
import com.example.tictactoe.service.Validator;
import lombok.AllArgsConstructor;

import static com.example.tictactoe.constants.TicTacToeConstants.WIN_MESSAGE;


public class BoardServiceImpl implements BoardService {

    private Board board;

    private int[] rowsCount;
    private int[] columnCount;

    private int diagnolCount;
    private int antiDiagnolCount;

    public BoardServiceImpl(Board board, int[] rowsCount, int[] columnCount) {
        this.board = board;
        this.rowsCount = rowsCount;
        this.columnCount = columnCount;
        diagnolCount = 0;
        antiDiagnolCount = 0;
    }

    @Override
    public String makeMoveAndFindWinner(Turn turn, Integer xCoordinate, Integer yCoordinate) {
        if(!Symbol.UNDERSCORE.getValue().equalsIgnoreCase(board.getBoard()[xCoordinate][yCoordinate]))
            throw new ColumnAlreadyOccupiedException();
        board.getBoard()[xCoordinate][yCoordinate] = turn.getSymbol();
        return checkWinner(turn, xCoordinate, yCoordinate);
    }

    private String checkWinner(Turn turn, Integer xCoordinate, Integer yCoordinate) {

        String winner = "";

        if ("x".equalsIgnoreCase(turn.getSymbol())) {
            rowsCount[xCoordinate]++;
            columnCount[yCoordinate]++;

            if (xCoordinate == yCoordinate)
                diagnolCount++;
            else if (xCoordinate + yCoordinate == board.getBoard().length - 1)
                diagnolCount++;
        } else {
            rowsCount[xCoordinate]--;
            columnCount[yCoordinate]--;

            if (xCoordinate == yCoordinate)
                diagnolCount--;
            else if (xCoordinate + yCoordinate == board.getBoard().length - 1)
                diagnolCount--;
        }


        if (Math.abs(rowsCount[xCoordinate]) == 3 || Math.abs(columnCount[yCoordinate]) == 3 ||
                Math.abs(diagnolCount) == 3 || Math.abs(diagnolCount) == 3) {
           winner = turn.getPlayer().getName();
        }

        return winner;
    }




}
