package com.example.fantasyleaguejavaserver.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "players")
public class Player {

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  public int getElement() {
    return element;
  }

  public void setElement(int element) {
    this.element = element;
  }

  public String getName() {
    return second_name;
  }

  public void setName(String name) {
    this.second_name = name;
  }

  public int getTotal_points() {
    return total_points;
  }

  public void setTotal_points(int total_points) {
    this.total_points = total_points;
  }

  public int getGoals_scored() {
    return goals_scored;
  }

  public void setGoals_scored(int goals_scored) {
    this.goals_scored = goals_scored;
  }

  public int getAssists() {
    return assists;
  }

  public void setAssists(int assists) {
    this.assists = assists;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getClean_sheets() {
    return clean_sheets;
  }

  public void setClean_sheets(int clean_sheets) {
    this.clean_sheets = clean_sheets;
  }

  public int getGoals_conceded() {
    return goals_conceded;
  }

  public void setGoals_conceded(int goals_conceded) {
    this.goals_conceded = goals_conceded;
  }

  //@CsvBindByName
  private int element;

  private String second_name;
  //@CsvBindByName
  private int total_points;
  // @CsvBindByName
  private int goals_scored;
  // @CsvBindByName
  private int assists;
  //@CsvBindByName
  private int minutes;
  // @CsvBindByName
  private int clean_sheets;
  // @CsvBindByName
  private int goals_conceded;

  public String getSecond_name() {
    return second_name;
  }

  public void setSecond_name(String second_name) {
    this.second_name = second_name;
  }

  public GameWeek getGameWeek() {
    return gameWeek;
  }

  public void setGameWeek(GameWeek gameWeek) {
    this.gameWeek = gameWeek;
  }

  @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
  private GameWeek gameWeek;
}
