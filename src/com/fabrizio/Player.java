package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player{
    private String name;
    private int matches;
    private List<Card> cards = new ArrayList<Card>();
    Scanner scanner = new Scanner(System.in);

    public Player(){
    // todo: pass in player name here
    }

    public String getName() {
        return name;
    }


//    todo: request and get matches methods
//    public int requestCard(){
//
//    }

    public int getMatches(){
      return matches;
    }


}
