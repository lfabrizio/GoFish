package com.fabrizio;

import java.util.Scanner;

public class Game {

    private Standard playerHand;
    private Standard opponentHand;
    private int playerMatches;
    private int opponentMatches;
    private boolean win;
    public static Scanner input = new Scanner(System.in);

    public Game() {

    }
    // welcome method finished
    public static void welcome(String gameChoice){
        System.out.print("Welcome to " + gameChoice);
        System.out.println("\n");
    }

    public static void playGame() {
        // Game Loop begins
        Game.welcome("Welcome to GoFish!!!");
        System.out.print("Enter Name");
        String name = input.nextLine();
        Game.firstRound();

        System.out.print("Cards Dealt ... ask for a card !");
        int player1 = input.nextInt();
        //todo: menu -- for commands
        // ask for number
        // player and opponent have their own array list to store hand
        // discard deck pile
    }


   public static void firstRound(){
       Standard myDeck = new Standard();
       myDeck.shuffle();
       for(int card = 0; card < 5; card++) {
           System.out.println("Player");
           myDeck.draw(true);
       }
        for(int i = 0;i < 5; i++){
            System.out.println("Opponent");
           myDeck.draw(false);
        }
       }

//    public void playerTurn(){
//        do {
//            if(!win){
//                System.out.println("Ask for a card");
//                int requestedCard = input.nextInt();
//            }
//        }
//    }

    public void opponentTurn(){
    }



    // display winner method finished
    public void displayWinner() {
        if(opponentMatches > playerMatches) {
            System.out.println("The Opponent Won!!\n" +
                    "Opponent : " + opponentMatches +
                    "\n Player : " + playerMatches);
        } else if(playerMatches > opponentMatches) {
            System.out.println("Congrats you Won!\n" +
                    "player has: " + playerMatches +
                    "\nOpponent has  : " + opponentMatches);
        } else if(playerMatches == opponentMatches) {
            System.out.println("The game was a tie!\n" +
                    "You both had " + playerMatches + " matches.");
        }
    }

}
