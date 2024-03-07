package com.example.registration_lookup.GUI;

import com.example.registration_lookup.model.Guest;
import com.example.registration_lookup.repository.GuestRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class GUI {

    public GUI(GuestRepository guestRepository){
        System.setProperty("java.awt.headless", "false");

        JFrame frame = new JFrame("Guest Registration");

        JLabel title = new JLabel("Guest Registration Search Engine");
        title.setBounds(50, 25, 300, 30);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(50, 100, 100, 30);

        JTextField searchText = new JTextField();
        searchText.setBounds(50, 50, 200, 30);
        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                List<Guest> searchResults;
                if(Objects.equals(searchText.getText(), "show all")){
                    searchResults = guestRepository.findAllByLastName();
                }
                else{
                    String searchQuery = searchText.getText().toLowerCase(Locale.ROOT);
                    searchResults = guestRepository.findByLastName(searchQuery.trim());
                }

                System.out.println("Search Result Size = " + searchResults.size());

                JFrame searchResultsFrame = new JFrame("Search Results");

                JLabel label = new JLabel("Search results will be displayed here. . .");
                label.setBounds(50, 50, 300, 30);

                List<String> baseDetails = new ArrayList<>();
                baseDetails.add(guestHeader());

                int count = 1;
                for(Guest guest : searchResults){
                    baseDetails.add(count + ": " + guest.previewData());
                    count++;
                }

                JList<Object> details = new JList<>(baseDetails.toArray());
                JScrollPane scrollPane = new JScrollPane(details);

                searchResultsFrame.add(scrollPane);
                searchResultsFrame.pack();
                searchResultsFrame.setLocationRelativeTo(null);
                searchResultsFrame.setSize(1000, 500);
                searchResultsFrame.setVisible(true);

                searchText.setText("");
            }

        });

        searchText.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e){}

            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    searchButton.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e){}

        });

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(155, 100, 100, 30);
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                searchText.setText("");
            }

        });

        frame.add(title);
        frame.add(searchText);
        frame.add(searchButton);
        frame.add(clearButton);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private String guestHeader(){
        String formattedName = String.format("%-30s", "Guest Name");
        String formattedEmergencyContactName = String.format("%-30s", "Emergency Contact Name");
        String formattedEmergencyContactNumber = String.format("%-30s", "Emergency Contact Phone Number");

        return "   " + formattedName + formattedEmergencyContactName + formattedEmergencyContactNumber;
    }

}
