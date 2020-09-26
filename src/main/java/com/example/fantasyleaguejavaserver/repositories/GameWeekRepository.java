package com.example.fantasyleaguejavaserver.repositories;

import com.example.fantasyleaguejavaserver.models.GameWeek;
import com.example.fantasyleaguejavaserver.models.MyTeam;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import javax.transaction.Transactional;

public interface GameWeekRepository extends CrudRepository<GameWeek,Integer> {

    @Query("SELECT gameweek FROM GameWeek gameweek")
    List<GameWeek> findAllGameWeeks();

    @Query(value = "SELECT * FROM game_week WHERE team_team_id=:myTeamID",nativeQuery = true)
    GameWeek findGameWeekByMyTeam(@Param("myTeamID") Integer myTeamID);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO game_week (game_week1, game_week2, game_week3,\n" +
            "game_week4, game_week5, game_week6, game_week7, game_week8, game_week9,\n" +
            "game_week10, game_week11,game_week12, game_week13, game_week14, game_week15,\n" +
            "game_week16, game_week17, game_week18, game_week19, game_week20, game_week21,\n" +
            " game_week22, game_week23, game_week24, game_week25, game_week26, game_week27, game_week28,\n" +
            " game_week29, game_week30, game_week31, game_week32, game_week33, game_week34,\n" +
            "  game_week35, game_week36, game_week37, game_week38, team_team_id) SELECT sum(game_week1),\n" +
            "sum(game_week2),\n" +
            "sum(game_week3),\n" +
            "sum(game_week4),\n" +
            "sum(game_week5),\n" +
            "sum(game_week6),\n" +
            "sum(game_week7),\n" +
            "sum(game_week8),\n" +
            "sum(game_week9),\n" +
            "sum(game_week10),\n" +
            "sum(game_week11),\n" +
            "sum(game_week12),\n" +
            "sum(game_week13),\n" +
            "sum(game_week14),\n" +
            "sum(game_week15),\n" +
            "sum(game_week16),\n" +
            "sum(game_week17),\n" +
            "sum(game_week18),\n" +
            "sum(game_week19),\n" +
            "sum(game_week20),\n" +
            "sum(game_week21),\n" +
            "sum(game_week22),\n" +
            "sum(game_week23),\n" +
            "sum(game_week24),\n" +
            "sum(game_week25),\n" +
            "sum(game_week26),\n" +
            "sum(game_week27),\n" +
            "sum(game_week28),\n" +
            "sum(game_week29),\n" +
            "sum(game_week30),\n" +
            "sum(game_week31),\n" +
            "sum(game_week32),\n" +
            "sum(game_week33),\n" +
            "sum(game_week34),\n" +
            "sum(game_week35),\n" +
            "sum(game_week36),\n" +
            "sum(game_week37),\n" +
            "sum(game_week38), :teamId\n" +
            "FROM game_week\n" +
            "WHERE player_id IN (:player1,:player2,:player3,:player4,:player5,:player6,:player7," +
            ":player8,:player9,:player10,:player11,:player12,:player13,:player14,:player15);\n", nativeQuery = true)
    int insertTeamGameWeek(@Param("teamId") Integer teamId, @Param("player1") Integer player1,
                             @Param("player2") Integer player2,
                             @Param("player3") Integer player3,
                             @Param("player4") Integer player4,
                             @Param("player5") Integer player5,
                             @Param("player6") Integer player6,
                             @Param("player7") Integer player7,
                             @Param("player8") Integer player8,
                             @Param("player9") Integer player9,
                             @Param("player10") Integer player10,
                             @Param("player11") Integer player11,
                             @Param("player12") Integer player12,
                             @Param("player13") Integer player13,
                             @Param("player14") Integer player14,
                             @Param("player15") Integer player15);

}
