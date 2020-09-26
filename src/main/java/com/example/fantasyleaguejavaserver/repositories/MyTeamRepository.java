package com.example.fantasyleaguejavaserver.repositories;

import com.example.fantasyleaguejavaserver.models.MyTeam;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyTeamRepository extends CrudRepository<MyTeam, Integer> {

    @Query("SELECT myteam FROM MyTeam myteam")
    List<MyTeam> findAllTeams();

    @Query(value = "SELECT * FROM teams WHERE user_userid=:userID",nativeQuery = true)
    MyTeam findMyTeamForUser(@Param("userID") Integer userID);

    @Query(value = "SELECT user_userid FROM teams WHERE team_id=:tID",nativeQuery = true)
    Integer findMyTeamUserId(@Param("tID") Integer tID);

}
