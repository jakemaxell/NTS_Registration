package com.example.registration_lookup.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue
    @Column(name = "guest_id", columnDefinition = "UUID")
    private UUID id;

    @Column(name = "date")
    private String date;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "emergency_contact_name")
    private String emergencyContactName;

    @Column(name = "emergency_contact_number")
    private String emergencyContactNumber;

    public Guest() {

    }

    public Guest(String date, String firstName, String lastName, String allergies, String emergencyContactName, String emergencyContactNumber) {
        this.date = date;
        this.firstName = firstName;
        this.lastName = lastName;
        this.allergies = allergies;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public UUID getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void getData(){
        System.out.println("ID: " + id);
        System.out.println("Guest Name: " + firstName + " " + lastName);
        System.out.println("Allergies: " + allergies);
        System.out.println("Emergency Contact Name: " + emergencyContactName);
        System.out.println("Emergency Contact Phone Number: " + emergencyContactNumber);
    }

    public String previewData() {
        String formattedFirstName = String.format("%-30s", firstName + " " + lastName);
        String formattedEmergencyContactName = String.format("%-30s", emergencyContactName);
        String formattedEmergencyContactNumber = String.format("%-80s", emergencyContactNumber);

        return formattedFirstName + formattedEmergencyContactName + formattedEmergencyContactNumber;
    }

}