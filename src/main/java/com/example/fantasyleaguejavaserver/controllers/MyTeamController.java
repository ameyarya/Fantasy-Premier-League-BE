package com.example.fantasyleaguejavaserver.controllers;

import com.example.fantasyleaguejavaserver.models.MyTeam;
import com.example.fantasyleaguejavaserver.services.MyTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MyTeamController {

    @Autowired
    MyTeamService service;

    @GetMapping("/api/teams")
    public List<MyTeam> getAllMyTeams() {
        return service.findAllTeams();
    }

    @GetMapping("/api/user/{userID}/team")
    public ResponseEntity<MyTeam> getMyTeamForUser(@PathVariable("userID") Integer userID) {
        MyTeam object = service.findMyTeamsByUser(userID);
        if(object != null){
            return ResponseEntity.ok(object);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PostMapping("/api/user/{uid}/team")
    public MyTeam createTeam(
            @PathVariable("uid") Integer userId,
            @RequestBody MyTeam team) {
        return service.createTeam(userId, team);
    }

    @PutMapping("/api/user/{uid}/team")
    public MyTeam updateTeam(
            @PathVariable("uid") Integer userId,
            @RequestBody MyTeam team) {
        return service.updateTeam(userId, team);
    }

    @GetMapping("/api/user/{userID}/team/stats")
    public MyTeam getTeamStats(@PathVariable("userID") Integer userID) {
        return service.findMyTeamsByUser(userID);
    }

    @DeleteMapping("/api/team/{teamId}")
    public int deleteWidget(@PathVariable("teamId") Integer wid) {
        return service.deleteTeam(wid);
    }

    @GetMapping("/api/user/team/{teamId}")
    public int getTeamUserId(@PathVariable("teamId") Integer teamId) {
        return service.findMyTeamUserId(teamId);
    }

}
