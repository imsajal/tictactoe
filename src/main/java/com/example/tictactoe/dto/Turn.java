package com.example.tictactoe.dto;

import com.example.tictactoe.model.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Turn {

   private Player player;
   private String symbol;

}
