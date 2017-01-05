package com.labac;

import java.util.ArrayList;

/**
 * Created by Bram on 29/11/2016.
 */
public class Deck {
    private String deckName;
    private ArrayList<Resource> resourceDeck;
    private ArrayList<Card> mainDeck;
    public Deck(String deckNameIn){
        deckName = deckNameIn;
        resourceDeck = new ArrayList<>();
        mainDeck = new ArrayList<>();
    }

    /**
     * getter for resource deck
     * @return
     */
    public ArrayList<Resource> getResourceDeck(){
        return resourceDeck;
    }

    /**
     * getter for mainDeck
     * @return
     */
    public ArrayList<Card> getMainDeck(){
        return mainDeck;
    }
    /**
     * returns whether or not adding the card was successfull
     *
     * checks if resource Deck was full
     * @param resourceIn
     * @return
     */
    public boolean addResource(Resource resourceIn){
        if(resourceDeck.size() < 20){
            resourceDeck.add(resourceIn);
            return true;
        }else{
            return false;//cardList is full
        }
    }

    public boolean addCard(Card cardIn){
        if(mainDeck.size() < 20){
            mainDeck.add(cardIn);
            return true;
        }else{
            return false;//cardList is full
        }
    }
}
