package com.labac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Bram on 05/01/2017.
 */
public class CardReader {
    public CardReader(){
        try{
            FileReader fr = new FileReader("CabalCardsTemp.xml");
            BufferedReader br = new BufferedReader(fr);
            ArrayList<Card> cardList = new ArrayList<>();
            System.out.println("successful");
            try (Scanner scanner =  new Scanner("CabalCardsTemp.xml")){
                while (scanner.hasNextLine()){
                    //process each line in some way
                    System.out.println(scanner.nextLine());
                }
            }
            System.out.println(br.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
