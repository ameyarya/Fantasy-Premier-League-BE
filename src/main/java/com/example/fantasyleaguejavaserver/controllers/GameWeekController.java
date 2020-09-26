package com.example.fantasyleaguejavaserver.controllers;

import com.example.fantasyleaguejavaserver.CSVUtils;
import com.example.fantasyleaguejavaserver.models.GameWeek;
import com.example.fantasyleaguejavaserver.repositories.GameWeekRepository;
import com.example.fantasyleaguejavaserver.services.GameWeekService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GameWeekController {

    @Autowired
    GameWeekService gameWeekService;

    @Autowired
    GameWeekRepository gameWeekRepository;

    @GetMapping("/api/gameweeks")
    public List<GameWeek> getAllGameWeeks() {
        return gameWeekService.findAllGameWeeks();
    }

    @GetMapping("/api/team/{myTeamID}/gameweek")
    public GameWeek getGameWeekForMyTeam(@PathVariable("myTeamID") Integer myTeamID) {
        return gameWeekService.findGameWeekByMyTeam(myTeamID);
    }

    @PostMapping(value = "/upload-game-week", consumes = "text/csv")
    public void uploadSimple(@RequestBody InputStream body) throws IOException {
        //gameWeekRepository.deleteAll();
        gameWeekRepository.saveAll(CSVUtils.read(GameWeek.class, body));
    }

    @PostMapping(value = "/upload-game-week", consumes = "multipart/form-data")
    public void uploadMultipart(@RequestParam("file") MultipartFile file) throws IOException {
        gameWeekRepository.saveAll(CSVUtils.read(GameWeek.class, file.getInputStream()));
    }

    @PostMapping("/api/team/{myTeamID}/gameweek")
    public int createTeamGameWeek(@PathVariable("myTeamID") Integer myTeamID) {
        return gameWeekService.createTeamGameWeek(myTeamID);
    }
}
