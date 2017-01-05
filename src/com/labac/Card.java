package com.labac;

/**
 * Created by Bram on 02/12/2016.
 */
public abstract class Card {
    private String name;
    private CardType type;
    public Card(CardType typeIn){
        type = typeIn;
    }
    public void setName(String nameIn){
        name = nameIn;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type.toString();
    }
}
