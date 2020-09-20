package com.company;

import java.util.List;
import java.util.stream.Stream;

public class BasketballTeam {
    private List<Player> bench;
    private List<Player> starter;

    public Player getPlayer(Player.PlayerType TeamType,List<Player> Team){
        Player temp = new Player();
        for(Player one:Team){
            if (one.getType() == TeamType){
                temp = one;
                break;
            }
        }
        return temp;
    }

    public void SwitchPlayer(Player.PlayerType t){
        int First = starter.indexOf(getPlayer(t,starter));
        int Sub = starter.indexOf(getPlayer(t,bench));
        Player temp = starter.remove(First);
        Player temp2 = bench.remove(Sub);
        starter.add(temp2);
        bench.add(temp);
    }

    public void AddToBench(Player New){
        bench.add(New);
    }

    public Player deletePlayer(Player Old){
        Player temp;
        if (bench.contains(Old)){
            temp = Old;
            bench.remove(Old);
            return temp;
        }
        else {
            temp = Old;
            starter.remove(Old);
            return temp;
        }
    }

    public void ChangeStarterList(List<Player> NewList){
        //TODO
        for(Player i:bench){

        }
    }


}

class Player{
    enum PlayerType{
        PG,SG,SF,PF,C
    }

    private String name;
    private int num;
    private PlayerType type;

    public Player(String name, int num, PlayerType type) {
        this.name = name;
        this.num = num;
        this.type = type;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}

