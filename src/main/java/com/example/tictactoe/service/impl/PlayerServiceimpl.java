package com.example.tictactoe.service.impl;

import com.example.tictactoe.model.Player;
import com.example.tictactoe.service.PlayerService;

import java.util.HashMap;
import java.util.Map;

public class PlayerServiceimpl implements PlayerService {

    Map<String, Player> players = new HashMap<>();
    @Override
    public void createPlayer(String name, String phone) {
      players.put(name, new Player(name,phone));
    }
}
