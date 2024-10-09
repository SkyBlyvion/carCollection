package org.example;

import org.example.model.Voiture;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    JFrame frame = new JFrame("Voiture 6Thousands");
    JPanel panel;
    JButton ajouter;
    JTable table;
    JScrollPane scrollPane;

    // Collection de voitures
    List<Voiture> voitures = new ArrayList<>();

    public static void main( String[] args )
    {
        new App().window();


    }

    private void window() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        panel = new JPanel();
        ajouter = new JButton("Ajouter une CAR");
        scrollPane = new JScrollPane();
        panel.add(ajouter);
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.SOUTH);
        frame.setVisible(true);
    }


}

