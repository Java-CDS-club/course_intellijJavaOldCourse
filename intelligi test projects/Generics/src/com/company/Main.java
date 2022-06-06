package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        footballPlayer joe = new footballPlayer("Joe");
        BaseballPlayer pat= new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<footballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");
        baseballTeam.addPlayer(pat);
        System.out.println(adelaideCrows.numPlayers());

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<footballPlayer> melbourne =  new Team<>("Melbourne");
        footballPlayer banks = new footballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<footballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<footballPlayer> fremantle = new Team<>("Fremantle");
        hawthorn.matchResult(fremantle , 1, 0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);
        //adelaideCrows.matchResult(baseballTeam,1,1);
        System.out.println("Ranking ");
        System.out.println(adelaideCrows.getName() + ": "+adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": "+ melbourne.ranking());
        System.out.println(fremantle.getName() + ": "+fremantle.ranking());
        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());
        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));

        League<Team<footballPlayer>>footballLeague = new League<>("AFL");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);
        footballLeague.showLeagueTable();
        
    }
}
