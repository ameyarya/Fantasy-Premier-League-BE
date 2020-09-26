package com.example.fantasyleaguejavaserver.services;

import com.example.fantasyleaguejavaserver.models.Player;
import com.example.fantasyleaguejavaserver.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
  @Autowired
  PlayerRepository playerRepository;

  public List<Player> findAllPlayers() {
    return playerRepository
            .findAllPlayers();
  }
}
