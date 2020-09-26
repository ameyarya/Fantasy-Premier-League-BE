package com.example.fantasyleaguejavaserver.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;
    private String firstName;
    private String lastName;
    private String role;
    private String email;
    private String password;
    private String tournamentList;
    private Integer gameWeekPoints;

    public MyTeam getMyTeam() {
        return myTeam;
    }

    public void setMyTeam(MyTeam myTeam) {
        this.myTeam = myTeam;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private MyTeam myTeam;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTournamentList() {
        return tournamentList;
    }

    public void setTournamentList(String tournamentList) {
        this.tournamentList = tournamentList;
    }

    public Integer getGameWeekPoints() {
        return gameWeekPoints;
    }

    public void setGameWeekPoints(Integer gameWeekPoints) {
        this.gameWeekPoints = gameWeekPoints;
    }
}
