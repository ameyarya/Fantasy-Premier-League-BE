package com.example.fantasyleaguejavaserver.controllers;

import com.example.fantasyleaguejavaserver.CSVUtils;
import com.example.fantasyleaguejavaserver.models.Player;
import com.example.fantasyleaguejavaserver.repositories.PlayerRepository;
import com.example.fantasyleaguejavaserver.repositories.UserRepository;
import com.example.fantasyleaguejavaserver.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PlayerController {

  @Autowired
  PlayerRepository repository;
  @Autowired
  PlayerService service;

  @GetMapping("/api/players/")
  public List<Player> getAllPlayers() {

    return service.findAllPlayers();
  }

  @PostMapping(value = "/upload", consumes = "text/csv")
  public void uploadSimple(@RequestBody InputStream body) throws IOException {
    repository.deleteAll();
    repository.saveAll(CSVUtils.read(Player.class, body));
  }

  @PostMapping(value = "/upload", consumes = "multipart/form-data")
  public void uploadMultipart(@RequestParam("file") MultipartFile file) throws IOException {
    repository.saveAll(CSVUtils.read(Player.class, file.getInputStream()));
  }
}
