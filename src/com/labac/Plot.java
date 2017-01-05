package com.labac;

/**
 * Created by Bram on 02/12/2016.
 */
public class Plot extends Card {

    private int cost;
    private String effect;
    /*
    create an abstract effect class with a
    passive version, on play version and empty
    version
    */
    private PlotType type;
    public Plot(PlotType typeIn){
        super(CardType.CITIZEN);
        type = typeIn;
        this.assignCitizen();
    }

    /**
     * this method assigns all the values of the Plot
     * depending on the enum
     *
     * therefor all permenant card alterations need to be
     * made here
     *
     * this needs to be alterred to access a database
     * @return
     */
    public boolean assignCitizen(){
        switch(type){
            case PLOT1:
                this.setName("PLOT1");
                cost = 1;
                effect = "";
                break;
            case PLOT2:
                this.setName("PLOT2");
                cost = 2;
                effect = "";
                break;
            default:
                return false;
        }
        return true;
    }
}
