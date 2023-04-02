package de.telran.averchenko.elena.homework22.task8;

import java.util.HashMap;
import java.util.Map;

public class Match {
    int year;
    int month;
    int day;
    String firstTeam;
    int firstTeamCount;
    int secondTeamCount;
    String secondTeam;
    String watchers;
    String stadium;
    final String NULL_VALUE = "NULL";

    public Match(String input) {
        String[] values = input.split(", ");
        year = Integer.parseInt(values[0]);
        month = Integer.parseInt(values[1]);
        day = Integer.parseInt(values[2]);
        firstTeam = values[3];
        String[] score = values[4].split(":");
        firstTeamCount = Integer.parseInt(score[0]);
        secondTeamCount = Integer.parseInt(score[1]);
        secondTeam = values[5];
        if (values[6].equals(NULL_VALUE)){
            watchers = "";
        } else{watchers = values[6];}

        if (values[7].equals(NULL_VALUE)){
            stadium = "";
        } else{stadium = values[7];}

    }

    public Match getTeamResults(Match currentMatch, String str){
        if(str.equals(firstTeam) || str.equals(secondTeam)){
            return currentMatch;
        }
        return null;
    }

    public Match getResultsByStadium(Match currentMatch, String str){
        if(str.equals(stadium)){
            return currentMatch;
        }
        return null;
    }

    public String getWinner(){
        if (firstTeamCount > secondTeamCount){
            return firstTeam;
        } else if (firstTeamCount < secondTeamCount) {
            return secondTeam;

        }
        return "НИЧЬЯ";
    }



    @Override
    public String toString() {
        return "Match{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", firstTeam='" + firstTeam + '\'' +
                ", firstTeamCount=" + firstTeamCount +
                ", secondTeamCount=" + secondTeamCount +
                ", secondTeam='" + secondTeam + '\'' +
                ", watchers=" + watchers +
                ", stadium='" + stadium +
                '}';
    }
}
