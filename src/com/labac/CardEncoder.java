package com.labac;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by Bram on 05/12/2016.
 */
public class CardEncoder {
    //staxDriver is more efficient than domDriver as it works progressively ( the driver is required for the class to run)

    private XStream xstream = new XStream(new DomDriver());
    private File xmlCards = new File("CabalCardsTemp.xml");
    private boolean newFile;
    public CardEncoder() {

    }

    public void writeCardsToFile(ArrayList<Card> cardList){
        if(!xmlCards.isFile()){
            try {
                System.out.println("file does not exist: setup");
                xmlCards.createNewFile();
                newFile = true;
            }catch(Exception  e){

            }
        }else{
            System.out.println("fileExists");
            newFile = false;
        }
        try{
            // Writes the content to the file
            FileWriter writer = new FileWriter(xmlCards, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            if(newFile){
                bufferedWriter.write(returnXml(cardList));
            }
            bufferedWriter.close();
            writer.flush();
            writer.close();
        }catch(Exception e){

        }
    }
    public String returnXml(ArrayList<Card> cardIn){
        String xml = xstream.toXML(cardIn);
        return xml;
    }

    public Card returnCard(String xml){
        return (Card)xstream.fromXML(xml);
    }

    public void initFile(){

    }
}
