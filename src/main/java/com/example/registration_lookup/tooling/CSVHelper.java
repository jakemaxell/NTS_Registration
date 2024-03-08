package com.example.registration_lookup.tooling;

import com.example.registration_lookup.model.Guest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {

    static final private String path = "/files/guests.csv";

    public static List<Guest> readGuestsFromFile(){
        List<Guest> guests = new ArrayList<Guest>();

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

//    private static Guest createGuest(String[] metaData){
//        String date = metaData[0];
//        String firstName = metaData[1].toLowerCase();
//        String lastName = metaData[2].toLowerCase();
//        String allergies = metaData[3].toLowerCase();
//        String emergencyContactName = metaData[4].toLowerCase();
//        String emergencyContactNumber = metaData[5].toLowerCase();
//
//        return new Guest(date, firstName, lastName, allergies, emergencyContactName, emergencyContactNumber);
//    }

    private static Guest createGuest(String[] metaData){
        return new Guest(metaData[0], metaData[1], metaData[2], metaData[3], metaData[4], metaData[5], metaData[6], metaData[7], metaData[8], metaData[9], metaData[10], metaData[11], metaData[12], metaData[13], metaData[14], metaData[15], metaData[16], metaData[17], metaData[18].toLowerCase(), metaData[19].toLowerCase(), metaData[20], metaData[21], metaData[22], metaData[23], metaData[24], metaData[25], metaData[26], metaData[27], metaData[28], metaData[29], metaData[30], metaData[31], metaData[32], metaData[33], metaData[34], metaData[35], metaData[36], metaData[37], metaData[38], metaData[39], metaData[40], metaData[41], metaData[42], metaData[43]);
    }

}
