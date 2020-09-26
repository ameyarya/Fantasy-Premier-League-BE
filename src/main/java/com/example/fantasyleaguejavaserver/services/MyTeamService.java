package com.example.fantasyleaguejavaserver.services;

import com.example.fantasyleaguejavaserver.models.GameWeek;
import com.example.fantasyleaguejavaserver.models.MyTeam;
import com.example.fantasyleaguejavaserver.models.Player;
import com.example.fantasyleaguejavaserver.models.User;
import com.example.fantasyleaguejavaserver.repositories.GameWeekRepository;
import com.example.fantasyleaguejavaserver.repositories.MyTeamRepository;
import com.example.fantasyleaguejavaserver.repositories.PlayerRepository;
import com.example.fantasyleaguejavaserver.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyTeamService {
  @Autowired
  UserRepository userRepository;

  @Autowired
  PlayerRepository playerRepository;

  @Autowired
  MyTeamRepository teamRepository;

  @Autowired
  GameWeekRepository gameWeekRepository;

  public List<MyTeam> findAllTeams() {
    return teamRepository.findAllTeams();
  }

  public MyTeam findMyTeamsByUser(Integer userID) {
    return teamRepository.findMyTeamForUser(userID);
  }

  public MyTeam createTeam(Integer userId, MyTeam team) {
    User user = userRepository.findById(userId).get();
    team.setUser(user);
    return teamRepository.save(team);
  }

  public MyTeam getTeamStats(Integer userID) {
      return teamRepository.findMyTeamForUser(userID);
  }

  public int deleteTeam(Integer wid) {
    teamRepository.deleteById(wid);
    return 1;
  }

  public MyTeam updateTeam(Integer userId, MyTeam updatedTeam) {
    MyTeam team = teamRepository.findMyTeamForUser(userId);
    float balance = updatedTeam.getBankBalance();
    if((int) balance != -99) {
      team.setBankBalance(updatedTeam.getBankBalance());
    }
    String playerList = updatedTeam.getPlayerList();
    if(!playerList.equals("empty")) {
      team.setPlayerList(updatedTeam.getPlayerList());
    }
    team.setTeamName(updatedTeam.getTeamName());
    return teamRepository.save(team);
  }

  public int findMyTeamUserId(Integer tid) {
    return teamRepository.findMyTeamUserId(tid);
  }
}
