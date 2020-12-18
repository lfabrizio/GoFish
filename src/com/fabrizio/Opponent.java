package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opponent implements Actor {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private List<Card> card = new ArrayList<Card>();


    public Opponent(){

    }

    public String getName() {
        return name;
    }


// todo: request card and matches methods
//    public int requestCard(){
//
//    }

//    public int getMatches(){
//
//    }
}
