package com.labac;

import java.util.ArrayList;

public class Main {

    /**
     * testing class before controller is implemented
     * @param args
     */
    public static void main(String[] args){
        Citizen ex1 = new Citizen(CitizenType.CITIZEN1);
        Citizen ex2 = new Citizen(CitizenType.CITIZEN2);
        Plot p1 = new Plot(PlotType.PLOT1);
        Plot p2 = new Plot(PlotType.PLOT2);
        CardEncoder CE = new CardEncoder();
        ArrayList<Card> cardListToFile = new ArrayList<>();
        cardListToFile.add(ex1);
        cardListToFile.add(ex2);
        cardListToFile.add(p1);
        cardListToFile.add(p2);
        CE.writeCardsToFile(cardListToFile);
        CardReader CR = new CardReader();
        //CardReader tempR = new CardReader();
        //run gui stuff
        Menu mainMenu = new Menu();
    }
}
