package com.example.fantasyleaguejavaserver.services;

import com.example.fantasyleaguejavaserver.models.User;
import com.example.fantasyleaguejavaserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }

    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    public Boolean validateUser(User user) {
        return userRepository.findUserByEmail(user.getEmail()).getPassword().equals(user.getPassword());
    }

    public int updateUser(User user){
        try{
            User userToUpdate = userRepository.findUserByEmail(user.getEmail());
            userToUpdate.setFirstName(user.getFirstName());
            userToUpdate.setLastName(user.getLastName());
            userToUpdate.setPassword(user.getPassword());
            userToUpdate.setRole(user.getRole());
            userRepository.save(userToUpdate);
            return 1;
        }catch(Exception e){
            return 0;
        }
    }

    public int deleteUser(Integer wid) {
        userRepository.deleteById(wid);
        return 1;
    }

    public User getUser(Integer wid) {
        return userRepository.findById(wid).get();
    }
}
