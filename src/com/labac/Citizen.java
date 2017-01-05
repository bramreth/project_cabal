package com.labac;

/**
 * this contains every card and its assigned values.
 * specific cards are stored as enums and depending on
 * the enum the Citizen is set to preassigned values.
 * Created by Bram on 02/12/2016.
 */
public class Citizen extends Card {

    private int cost;
    private String effect;
    /*
    create an abstract effect class with a
    passive version, on play version and empty
    version
    */
    private int power;
    private CitizenType type;
    public Citizen(CitizenType typeIn){
        super(CardType.CITIZEN);
        type = typeIn;
        this.assignCitizen();
    }

    /**
     * this method assigns all the values of the Citizen
     * depending on the enum
     *
     * therefor all permenant card alterations need to be
     * made here
     * this needs to be alterred to access a database
     * @return
     */
    public boolean assignCitizen(){
        switch(type){
            case CITIZEN1:
                this.setName("EXAMPLE1");
                cost = 1;
                power = 1;
                effect = "";
                break;
            case CITIZEN2:
                this.setName("EXAMPLE2");
                cost = 2;
                power = 3;
                effect = "";
                break;
            default:
                return false;
        }
        return true;
    }
}
