package com.example.fantasyleaguejavaserver.repositories;

import com.example.fantasyleaguejavaserver.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT user FROM User user")
    List<User> findAllUsers();

    @Query("SELECT user FROM User user WHERE user.email=:userEmail")
    User findUserByEmail(
            @Param("userEmail") String userEmail);

    @Query("SELECT user FROM User user WHERE user.email=:email AND user.password=:password")
    public User findUserByCredentials(
            @Param("email") String email,
            @Param("password") String password
    );

}
