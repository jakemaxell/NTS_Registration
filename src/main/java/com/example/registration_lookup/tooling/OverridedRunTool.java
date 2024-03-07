package com.example.registration_lookup.tooling;

import com.example.registration_lookup.GUI.GUI;
import com.example.registration_lookup.model.Guest;
import com.example.registration_lookup.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OverridedRunTool implements CommandLineRunner {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public void run(String... args) throws Exception{
        loadDatabase();
        main(args, guestRepository);
    }

    public void loadDatabase(){
        System.out.println("Loading the Database. . .");
        List<Guest> guests = CSVHelper.readGuestsFromFile();
        guestRepository.saveAll(guests);
    }

    public static void main(String[] args, GuestRepository guestRepository){
        new GUI(guestRepository);
    }

}
