package com.example.fantasyleaguejavaserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "gameWeek")
public class GameWeek {
    public Integer getGameWeekID() {
        return gameWeekID;
    }

    public void setGameWeekID(Integer gameWeekID) {
        this.gameWeekID = gameWeekID;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public MyTeam getTeam() {
        return team;
    }

    public void setTeam(MyTeam team) {
        this.team = team;
    }

    public Integer getGameWeek1() {
        return gameWeek1;
    }

    public void setGameWeek1(Integer gameWeek1) {
        this.gameWeek1 = gameWeek1;
    }

    public Integer getGameWeek2() {
        return gameWeek2;
    }

    public void setGameWeek2(Integer gameWeek2) {
        this.gameWeek2 = gameWeek2;
    }

    public Integer getGameWeek3() {
        return gameWeek3;
    }

    public void setGameWeek3(Integer gameWeek3) {
        this.gameWeek3 = gameWeek3;
    }

    public Integer getGameWeek4() {
        return gameWeek4;
    }

    public void setGameWeek4(Integer gameWeek4) {
        this.gameWeek4 = gameWeek4;
    }

    public Integer getGameWeek5() {
        return gameWeek5;
    }

    public void setGameWeek5(Integer gameWeek5) {
        this.gameWeek5 = gameWeek5;
    }

    public Integer getGameWeek6() {
        return gameWeek6;
    }

    public void setGameWeek6(Integer gameWeek6) {
        this.gameWeek6 = gameWeek6;
    }

    public Integer getGameWeek7() {
        return gameWeek7;
    }

    public void setGameWeek7(Integer gameWeek7) {
        this.gameWeek7 = gameWeek7;
    }

    public Integer getGameWeek8() {
        return gameWeek8;
    }

    public void setGameWeek8(Integer gameWeek8) {
        this.gameWeek8 = gameWeek8;
    }

    public Integer getGameWeek9() {
        return gameWeek9;
    }

    public void setGameWeek9(Integer gameWeek9) {
        this.gameWeek9 = gameWeek9;
    }

    public Integer getGameWeek10() {
        return gameWeek10;
    }

    public void setGameWeek10(Integer gameWeek10) {
        this.gameWeek10 = gameWeek10;
    }

    public Integer getGameWeek11() {
        return gameWeek11;
    }

    public void setGameWeek11(Integer gameWeek11) {
        this.gameWeek11 = gameWeek11;
    }

    public Integer getGameWeek12() {
        return gameWeek12;
    }

    public void setGameWeek12(Integer gameWeek12) {
        this.gameWeek12 = gameWeek12;
    }

    public Integer getGameWeek13() {
        return gameWeek13;
    }

    public void setGameWeek13(Integer gameWeek13) {
        this.gameWeek13 = gameWeek13;
    }

    public Integer getGameWeek14() {
        return gameWeek14;
    }

    public void setGameWeek14(Integer gameWeek14) {
        this.gameWeek14 = gameWeek14;
    }

    public Integer getGameWeek15() {
        return gameWeek15;
    }

    public void setGameWeek15(Integer gameWeek15) {
        this.gameWeek15 = gameWeek15;
    }

    public Integer getGameWeek16() {
        return gameWeek16;
    }

    public void setGameWeek16(Integer gameWeek16) {
        this.gameWeek16 = gameWeek16;
    }

    public Integer getGameWeek17() {
        return gameWeek17;
    }

    public void setGameWeek17(Integer gameWeek17) {
        this.gameWeek17 = gameWeek17;
    }

    public Integer getGameWeek18() {
        return gameWeek18;
    }

    public void setGameWeek18(Integer gameWeek18) {
        this.gameWeek18 = gameWeek18;
    }

    public Integer getGameWeek19() {
        return gameWeek19;
    }

    public void setGameWeek19(Integer gameWeek19) {
        this.gameWeek19 = gameWeek19;
    }

    public Integer getGameWeek20() {
        return gameWeek20;
    }

    public void setGameWeek20(Integer gameWeek20) {
        this.gameWeek20 = gameWeek20;
    }

    public Integer getGameWeek21() {
        return gameWeek21;
    }

    public void setGameWeek21(Integer gameWeek21) {
        this.gameWeek21 = gameWeek21;
    }

    public Integer getGameWeek22() {
        return gameWeek22;
    }

    public void setGameWeek22(Integer gameWeek22) {
        this.gameWeek22 = gameWeek22;
    }

    public Integer getGameWeek23() {
        return gameWeek23;
    }

    public void setGameWeek23(Integer gameWeek23) {
        this.gameWeek23 = gameWeek23;
    }

    public Integer getGameWeek24() {
        return gameWeek24;
    }

    public void setGameWeek24(Integer gameWeek24) {
        this.gameWeek24 = gameWeek24;
    }

    public Integer getGameWeek25() {
        return gameWeek25;
    }

    public void setGameWeek25(Integer gameWeek25) {
        this.gameWeek25 = gameWeek25;
    }

    public Integer getGameWeek26() {
        return gameWeek26;
    }

    public void setGameWeek26(Integer gameWeek26) {
        this.gameWeek26 = gameWeek26;
    }

    public Integer getGameWeek27() {
        return gameWeek27;
    }

    public void setGameWeek27(Integer gameWeek27) {
        this.gameWeek27 = gameWeek27;
    }

    public Integer getGameWeek28() {
        return gameWeek28;
    }

    public void setGameWeek28(Integer gameWeek28) {
        this.gameWeek28 = gameWeek28;
    }

    public Integer getGameWeek29() {
        return gameWeek29;
    }

    public void setGameWeek29(Integer gameWeek29) {
        this.gameWeek29 = gameWeek29;
    }

    public Integer getGameWeek30() {
        return gameWeek30;
    }

    public void setGameWeek30(Integer gameWeek30) {
        this.gameWeek30 = gameWeek30;
    }

    public Integer getGameWeek31() {
        return gameWeek31;
    }

    public void setGameWeek31(Integer gameWeek31) {
        this.gameWeek31 = gameWeek31;
    }

    public Integer getGameWeek32() {
        return gameWeek32;
    }

    public void setGameWeek32(Integer gameWeek32) {
        this.gameWeek32 = gameWeek32;
    }

    public Integer getGameWeek33() {
        return gameWeek33;
    }

    public void setGameWeek33(Integer gameWeek33) {
        this.gameWeek33 = gameWeek33;
    }

    public Integer getGameWeek34() {
        return gameWeek34;
    }

    public void setGameWeek34(Integer gameWeek34) {
        this.gameWeek34 = gameWeek34;
    }

    public Integer getGameWeek35() {
        return gameWeek35;
    }

    public void setGameWeek35(Integer gameWeek35) {
        this.gameWeek35 = gameWeek35;
    }

    public Integer getGameWeek36() {
        return gameWeek36;
    }

    public void setGameWeek36(Integer gameWeek36) {
        this.gameWeek36 = gameWeek36;
    }

    public Integer getGameWeek37() {
        return gameWeek37;
    }

    public void setGameWeek37(Integer gameWeek37) {
        this.gameWeek37 = gameWeek37;
    }

    public Integer getGameWeek38() {
        return gameWeek38;
    }

    public void setGameWeek38(Integer gameWeek38) {
        this.gameWeek38 = gameWeek38;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameWeekID;

    @OneToOne
    @JsonIgnore
    private Player player;

    @OneToOne
    @JsonIgnore
    private MyTeam team;


    private Integer gameWeek1;
    private Integer gameWeek2;
    private Integer gameWeek3;
    private Integer gameWeek4;
    private Integer gameWeek5;
    private Integer gameWeek6;
    private Integer gameWeek7;
    private Integer gameWeek8;
    private Integer gameWeek9;
    private Integer gameWeek10;
    private Integer gameWeek11;
    private Integer gameWeek12;
    private Integer gameWeek13;
    private Integer gameWeek14;
    private Integer gameWeek15;
    private Integer gameWeek16;
    private Integer gameWeek17;
    private Integer gameWeek18;
    private Integer gameWeek19;
    private Integer gameWeek20;
    private Integer gameWeek21;
    private Integer gameWeek22;
    private Integer gameWeek23;
    private Integer gameWeek24;
    private Integer gameWeek25;
    private Integer gameWeek26;
    private Integer gameWeek27;
    private Integer gameWeek28;
    private Integer gameWeek29;
    private Integer gameWeek30;
    private Integer gameWeek31;
    private Integer gameWeek32;
    private Integer gameWeek33;
    private Integer gameWeek34;
    private Integer gameWeek35;
    private Integer gameWeek36;
    private Integer gameWeek37;
    private Integer gameWeek38;





}
