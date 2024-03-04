package com.example.registration_lookup.repository;

import com.example.registration_lookup.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface GuestRepository extends JpaRepository<Guest, UUID> {

    @Query("SELECT g FROM Guest g WHERE g.lastName = :lastName")
    List<Guest> findByLastName(String lastName);

}
