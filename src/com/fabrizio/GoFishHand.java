package com.fabrizio;

import java.util.ArrayList;
import java.util.List;

public class GoFishHand {
    List<Card> cards = new ArrayList<>();
    private Player player;
    private int score;

    public GoFishHand(Player player){
        this.player = player;
    }



    public int getHandCount() {
        return cards.size();
    }

    public String getName(){
        return player.getName();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public Card removeCard(int index){
        return cards.remove(index);
    }

    public int getCardValue(int card){
        return cards.get(card).getValue();
    }

//    todo: do you have a match
        public boolean isMatch(){
        if(cards.size() > 3) return true;
        return false;
        }

        public boolean isEmpty(){
        if(cards.size() == 0){
            return true;
        }
        return false;
        }
}