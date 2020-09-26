package com.example.fantasyleaguejavaserver.services;

import com.example.fantasyleaguejavaserver.models.GameWeek;
import com.example.fantasyleaguejavaserver.models.MyTeam;
import com.example.fantasyleaguejavaserver.models.User;
import com.example.fantasyleaguejavaserver.repositories.GameWeekRepository;
import com.example.fantasyleaguejavaserver.repositories.MyTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameWeekService {

    @Autowired
    GameWeekRepository gameWeekRepository;

    @Autowired
    MyTeamRepository teamRepository;

    public List<GameWeek> findAllGameWeeks() {
        return gameWeekRepository.findAllGameWeeks();
    }

    public GameWeek findGameWeekByMyTeam(Integer myTeamID) {
        return gameWeekRepository.findGameWeekByMyTeam(myTeamID);
    }

    public int createTeamGameWeek(Integer teamId) {
        MyTeam team = teamRepository.findById(teamId).get();
        List<Integer> list = getPlayerList(team.getPlayerList());
        gameWeekRepository.insertTeamGameWeek(team.getTeamId(), list.get(0),
                list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6),
                list.get(7), list.get(8), list.get(9), list.get(10), list.get(11), list.get(12),
                list.get(13), list.get(14));
        return 1;
    }

    private List<Integer> getPlayerList(String playerList) {
        // vals.split(",") to get a list of Strings, then typecast/parse them to ints before returning
        String[] convertedPlayerArray = playerList.split(",");
        List<Integer> convertedPlayerList = new ArrayList<Integer>();
        for (String number : convertedPlayerArray) {
            convertedPlayerList.add(Integer.parseInt(number.trim()));
        }
        return convertedPlayerList;
    }

}
