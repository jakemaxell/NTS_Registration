package com.example.registration_lookup.tooling;

import com.example.registration_lookup.model.Guest;
import com.example.registration_lookup.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class OverridedRunTool implements CommandLineRunner {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public void run(String... args) throws Exception{
        main(args, guestRepository);
    }

    public static void main(String[] args, GuestRepository guestRepository){
        Scanner scanner = new Scanner(System.in);

        List<Guest> guests = CSVHelper.readGuestsFromFile();
        guestRepository.saveAll(guests);

        System.out.print("Please enter a last name: ");
        String lastName = scanner.nextLine();

        List<Guest> guestsByLastName = guestRepository.findByLastName(lastName.toLowerCase());
        for(Guest guest : guestsByLastName){
            guest.getData();
            System.out.println();
        }
    }

}