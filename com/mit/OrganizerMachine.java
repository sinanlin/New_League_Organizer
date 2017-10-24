package com.mit;
import com.mit.model.Team;
import com.mit.model.Player;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Queue;
import java.io.*;

public class OrganizerMachine{

  private Team mTeam;
  private List<Team> mTeams;

  private Map<String, String> mMenu;
  private BufferedReader mReader;

  public OrganizerMachine(Team team){

    mReader = new BufferedReader(new InputStreamReader(System.in));
    mMenu = new HashMap<String, String>();
    mTeam = team;
    mTeams = new ArrayList<Team>();

    mMenu.put("Create","Create a new Team");

    mMenu.put("Add","Add player to a team");

    mMenu.put("Remove","Remove a player from the team");

    mMenu.out("View","View team roster");

    mMenu.put("Report","Display height report");

    mMenu.out("Balance","League Balance Report");

    mMenu.put("Quit","Exit the program");

  }


  public void run(){
    String choice = "";

    do{
      try{
        choice = promptAction();
        switch(choice){
          case "create":

          break;

          case "add":

          break;


          case "remove":

          break;

          case "view":

          break;

          case "report":

          break;

          case "blance":

          break;

          case "quit":

          break;

          default:
          System.out.printf("Unknown choice: '%s'. Try again. %n%n",choice);
          break;
        }

      }catch(IOException ioe){
        System.out.println("Ploblem with input");
        ioe.printStackTrace();
      }
    }while(!choice.equals("quit"));

  }

}
