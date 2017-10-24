package com.mit.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class Team implements Comparable<Team> {

  private String mteamName;
  private String mCoach;
  private Set<Player> mPlayer;


  public Team(String teamName, String coach){
    mteamName = teamName;
    mCoach = coach;
    mPlayer = new TreeSet<Player>();
  }
//Funciton related to player:
  public void addPlayer(Player player){
    mPlayer.add(player);
  }

  public void removePlayer(Player player){
    mPlayer.remove(player);
  }

  public int getTeamPlayerCount(){
    return mPlayer.size();
  }

  public Set<Player> getPlayers(){
    return mPlayer;
  }

  public boolean hasPlayer(Player player){
    return mPlayer.contains(player);
  }
//Funciton related to team
  public String getTeamName( ){
    return mteamName;
  }

  public String getCoach(){
    return mCoach;
  }

  @Override
  public int compareTo(Team team){
    return mteamName.compareTo(team.getTeamName());
  }


//Addding player by team. This should be cache
  private Map<String, List<Player>> byTeam(){
    Map<String,List<Player>> byTeam = new TreeMap<>();
    for(Player player : mPlayer){
      List<Player> teamPlayer = byTeam.get(player.getPlayerTeam());
      if(teamPlayer == null){
        teamPlayer = new ArrayList<>();
        byTeam.put(player.getPlayerTeam(), teamPlayer);
      }
      teamPlayer.add(player);
    }
    return byTeam;
  }


  public Set<String> getTeam(){
    return byTeam().keySet();
  }

  public List<Player> getPlayerByTeam(String team){
    return byTeam().get(team);
  }








  /*
    public void displayPlayer(){
        for(Player player : mPlayer){
            System.out.printf(
            "NAME:%s | TEAM: %s | HEIGHT: %d | EXPERIENCE: %s %n",
            player.getPlayerName(),
            player.getPlayerTeam(),
            player.getPlayerHeight(),
            player.getPlayerExperience());
        }
    }
  */

}
