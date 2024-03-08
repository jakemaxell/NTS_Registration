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

    @Column(name = "form_name")
    private String formName;

    @Column(name = "creation_date")
    private String creationDate;

    @Column(name = "detail")
    private String detail;

    @Column(name = "parent_last_name")
    private String parentLastName;

    @Column(name = "parent_first_name")
    private String parentFirstName;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "email")
    private String email;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "payment")
    private String payment;

    @Column(name = "link")
    private String linkToForm;

    @Column(name = "language")
    private String language;

    @Column(name = "status")
    private String status;

    @Column(name = "ticket_number")
    private String ticketNumber;

    @Column(name = "occurrence")
    private String occurrence;

    @Column(name = "eticket")
    private String eTicketURL;

    @Column(name = "buddyAcknowledgement")
    private String acknowledgement;

    @Column(name = "prefix")
    private String prefix;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private String dateOfBirth;

    @Column(name = "emergency_contact_name")
    private String emergencyContactName;

    @Column(name = "emergency_contact_number")
    private String emergencyContactNumber;

    @Column(name = "buddy_inquiry")
    private String hasABuddy;

    @Column(name = "buddy_name")
    private String buddyName;

    @Column(name = "food_allergies")
    private String allergies;

    @Column(name = "food_allergies_details")
    private String allergyDetails;

    @Column(name = "dietary_needs")
    private String dietaryNeeds;

    @Column(name = "medical_concerns")
    private String medicalConcerns;

    @Column(name = "medical_concerns_details")
    private String medicalConcernsDetails;

    @Column(name = "special_communication")
    private String specialCommunicationNeeds;

    @Column(name = "bathroomAttendentAcknowledgement")
    private String bathroomAttendentAcknowledgement;

    @Column(name = "medicationAdministrationAcknowledgement")
    private String medicationAdministrationAcknowledgement;

    @Column(name = "parentStaying")
    private String parentStaying;

    @Column(name = "medialLiabilityWaver")
    private String medialLiabilityWaver;

    @Column(name = "timTebowWaver")
    private String timTebowWaver;

    @Column(name = "parentTruthfulnessWarranty")
    private String parentTruthfulnessWarranty;

    @Column(name = "termsOfAcceptance")
    private String termsOfAcceptance;

    @Column(name = "specialNeedsExperience")
    private String specialNeedsExperience;

    @Column(name = "thursday_setup")
    private String thursdayAvailability;

    @Column(name = "countyLineMediaLiability")
    private String countyLineMediaLiability;

    @Column(name = "warranty")
    private String secondTruthfulnessWarranty;

    @Column(name = "legalSignature")
    private String legalSignature;

    @Column(name = "payout_date")
    private String payoutDate;

    public Guest(String formName, String creationDate, String detail, String parentLastName, String parentFirstName, String companyName, String email, String region, String country, String payment, String linkToForm, String language, String status, String ticketNumber, String occurrence, String eTicketURL, String acknowledgement, String prefix, String firstName, String lastName, String dateOfBirth, String emergencyContactName, String emergencyContactNumber, String hasABuddy, String buddyName, String allergies, String allergyDetails, String dietaryNeeds, String medicalConcerns, String medicalConcernsDetails, String specialCommunicationNeeds, String bathroomAttendentAcknowledgement, String medicationAdministrationAcknowledgement, String parentStaying, String medialLiabilityWaver, String timTebowWaver, String parentTruthfulnessWarranty, String termsOfAcceptance, String specialNeedsExperience, String thursdayAvailability, String countyLineMediaLiability, String secondTruthfulnessWarranty, String legalSignature, String payoutDate) {
        this.formName = formName;
        this.creationDate = creationDate;
        this.detail = detail;
        this.parentLastName = parentLastName;
        this.parentFirstName = parentFirstName;
        this.companyName = companyName;
        this.email = email;
        this.region = region;
        this.country = country;
        this.payment = payment;
        this.linkToForm = linkToForm;
        this.language = language;
        this.status = status;
        this.ticketNumber = ticketNumber;
        this.occurrence = occurrence;
        this.eTicketURL = eTicketURL;
        this.acknowledgement = acknowledgement;
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactNumber = emergencyContactNumber;
        this.hasABuddy = hasABuddy;
        this.buddyName = buddyName;
        this.allergies = allergies;
        this.allergyDetails = allergyDetails;
        this.dietaryNeeds = dietaryNeeds;
        this.medicalConcerns = medicalConcerns;
        this.medicalConcernsDetails = medicalConcernsDetails;
        this.specialCommunicationNeeds = specialCommunicationNeeds;
        this.bathroomAttendentAcknowledgement = bathroomAttendentAcknowledgement;
        this.medicationAdministrationAcknowledgement = medicationAdministrationAcknowledgement;
        this.parentStaying = parentStaying;
        this.medialLiabilityWaver = medialLiabilityWaver;
        this.timTebowWaver = timTebowWaver;
        this.parentTruthfulnessWarranty = parentTruthfulnessWarranty;
        this.termsOfAcceptance = termsOfAcceptance;
        this.specialNeedsExperience = specialNeedsExperience;
        this.thursdayAvailability = thursdayAvailability;
        this.countyLineMediaLiability = countyLineMediaLiability;
        this.secondTruthfulnessWarranty = secondTruthfulnessWarranty;
        this.legalSignature = legalSignature;
        this.payoutDate = payoutDate;
    }

    public Guest() {

    }

    public UUID getId() {
        return id;
    }

    public String getFormName() {
        return formName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getDetail() {
        return detail;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getPayment() {
        return payment;
    }

    public String getLinkToForm() {
        return linkToForm;
    }

    public String getLanguage() {
        return language;
    }

    public String getStatus() {
        return status;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getOccurrence() {
        return occurrence;
    }

    public String geteTicketURL() {
        return eTicketURL;
    }

    public String getAcknowledgement() {
        return acknowledgement;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public String getHasABuddy() {
        return hasABuddy;
    }

    public String getBuddyName() {
        return buddyName;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getAllergyDetails() {
        return allergyDetails;
    }

    public String getDietaryNeeds() {
        return dietaryNeeds;
    }

    public String getMedicalConcerns() {
        return medicalConcerns;
    }

    public String getMedicalConcernsDetails() {
        return medicalConcernsDetails;
    }

    public String getSpecialCommunicationNeeds() {
        return specialCommunicationNeeds;
    }

    public String getBathroomAttendentAcknowledgement() {
        return bathroomAttendentAcknowledgement;
    }

    public String getMedicationAdministrationAcknowledgement() {
        return medicationAdministrationAcknowledgement;
    }

    public String getParentStaying() {
        return parentStaying;
    }

    public String getMedialLiabilityWaver() {
        return medialLiabilityWaver;
    }

    public String getTimTebowWaver() {
        return timTebowWaver;
    }

    public String getParentTruthfulnessWarranty() {
        return parentTruthfulnessWarranty;
    }

    public String getTermsOfAcceptance() {
        return termsOfAcceptance;
    }

    public String getSpecialNeedsExperience() {
        return specialNeedsExperience;
    }

    public String getThursdayAvailability() {
        return thursdayAvailability;
    }

    public String getCountyLineMediaLiability() {
        return countyLineMediaLiability;
    }

    public String getSecondTruthfulnessWarranty() {
        return secondTruthfulnessWarranty;
    }

    public String getLegalSignature() {
        return legalSignature;
    }

    public String getPayoutDate() {
        return payoutDate;
    }

    public String previewData() {
        String formattedFirstName = String.format("%-30s", firstName + " " + lastName);
        String formattedEmergencyContactName = String.format("%-30s", emergencyContactName);
        String formattedEmergencyContactNumber = String.format("%-80s", emergencyContactNumber);

        return formattedFirstName + formattedEmergencyContactName + formattedEmergencyContactNumber;
    }

}