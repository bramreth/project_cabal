package com.labac;
import javax.swing.*;

/**
 * The Gui builder for the menu
 * Created by Bram on 04/01/2017.
 */
public class Menu{

    public Menu(){
        JFrame frame = new JFrame("cabalMenu");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        JLabel title = new JLabel("Cabal Menu");
        title.setBounds(10,20,80,25);
        titlePanel.add(title);
        frame.add(titlePanel);

    }

}
