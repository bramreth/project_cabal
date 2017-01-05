package com.labac;

import java.util.ArrayList;

/**
 * Created by Bram on 29/11/2016.
 */
public class Player {
    private String name;
    private ArrayList<Deck> deckList;
    public Player(String nameIn){
        name = nameIn;
        deckList = new ArrayList<>();
    }
    public void addDeck(Deck deckIn){
        deckList.add(deckIn);
    }
}
