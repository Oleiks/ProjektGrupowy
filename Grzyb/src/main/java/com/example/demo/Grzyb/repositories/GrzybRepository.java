package com.example.demo.Grzyb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Grzyb.entities.Grzyb;
import java.util.UUID;

@Repository

public interface GrzybRepository extends JpaRepository<Grzyb, UUID> {
     Grzyb findByName(String title);
}
