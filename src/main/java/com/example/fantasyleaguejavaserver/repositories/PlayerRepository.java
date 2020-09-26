package com.example.fantasyleaguejavaserver.repositories;

import com.example.fantasyleaguejavaserver.models.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository
        extends CrudRepository<Player, Integer> {

  @Query("SELECT player FROM Player player")
  public List<Player> findAllPlayers();
}
