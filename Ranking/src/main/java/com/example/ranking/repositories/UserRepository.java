package com.example.ranking.repositories;

import com.example.ranking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    @Query("SELECT u FROM User u WHERE u.firstName= :firstName AND u.lastName = :lastName")
    public Optional<User> findByName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
