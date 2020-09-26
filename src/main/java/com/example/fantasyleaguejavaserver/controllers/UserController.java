package com.example.fantasyleaguejavaserver.controllers;

import com.example.fantasyleaguejavaserver.models.Player;
import com.example.fantasyleaguejavaserver.models.User;
import com.example.fantasyleaguejavaserver.repositories.UserRepository;
import com.example.fantasyleaguejavaserver.services.UserService;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowCredentials = "true")
public class UserController {

    @Autowired
    UserRepository repository;

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(
            @RequestBody User user,
            HttpSession session) {
        if(repository.findUserByEmail(user.getEmail()) == null) {
            repository.save(user);
            session.setAttribute("currentUser", user);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PostMapping("/currentUser")
    public ResponseEntity<User> currentUser(HttpSession session) {
        User object = (User) session.getAttribute("currentUser");
        if(object != null){
            return ResponseEntity.ok(object);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PostMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(
            @RequestBody User user,
            HttpSession session) {
        user = repository.findUserByCredentials(user.getEmail(), user.getPassword());

        if(user != null){
            session.setAttribute("currentUser", user);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PutMapping("/update")
    public int updateTopic(
            @RequestBody User user, HttpSession session) {
        session.setAttribute("currentUser", user);
        return userService.updateUser(user);
    }

    @PostMapping("/userList")
    public List<User> getAllUser(@RequestBody User user) {
        if (user.getRole().equals("Admin")) {
            return userService.findAllUsers();
        }
        return new ArrayList<>();
    }

    @DeleteMapping("/api/users/{userId}")
    public int deleteUser(@PathVariable("userId") Integer uid) {
        return userService.deleteUser(uid);
    }

    @GetMapping("/api/users/{userId}")
    public User getUser(@PathVariable("userId") Integer wid) {
        return userService.getUser(wid);
    }

}
