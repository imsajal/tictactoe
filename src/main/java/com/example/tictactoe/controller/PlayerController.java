package com.example.tictactoe.controller;

import com.example.tictactoe.service.PlayerService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlayerController {

    private PlayerService playerService;

    public void createPlayer(String name, String phone){
        playerService.createPlayer(name,phone);
    }
}
