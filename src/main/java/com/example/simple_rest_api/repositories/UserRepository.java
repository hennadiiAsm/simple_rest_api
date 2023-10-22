package com.example.simple_rest_api.repositories;

import com.example.simple_rest_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    void deleteByEmail(String email);

    List<User> findByBirthDateBetween(LocalDate from, LocalDate to);

}
