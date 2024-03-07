package com.example.registration_lookup.tooling;

import com.example.registration_lookup.model.Guest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {

    static final private String path = "/files/test_guest_data.csv";
//    final private String[] HEADERS = {"date", "first name", "last name", "allergies", "emergency contact name", "emergency contact number"};

    public static List<Guest> readGuestsFromFile(){
        List<Guest> guests = new ArrayList<Guest>();
//        Path pathToFile = Paths.get(path);

        try(InputStream inputStream = CSVHelper.class.getResourceAsStream(path);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))){
            String line = bufferedReader.readLine();
            while(line != null){
                String[] attributes = line.split(",");

                Guest guest = createGuest(attributes);
                guests.add(guest);

                line = bufferedReader.readLine();
            }
        } catch(Exception exception){
            System.out.println(exception.toString());
        }

        if(!guests.isEmpty()){
            guests.remove(0);
        }

        return guests;
    }

    private static Guest createGuest(String[] metaData){
        String date = metaData[0];
        String firstName = metaData[1].toLowerCase();
        String lastName = metaData[2].toLowerCase();
        String allergies = metaData[3].toLowerCase();
        String emergencyContactName = metaData[4].toLowerCase();
        String emergencyContactNumber = metaData[5].toLowerCase();

        return new Guest(date, firstName, lastName, allergies, emergencyContactName, emergencyContactNumber);
    }

}
