package com.example.libraryApp.repository;


import com.example.libraryApp.dao.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer > {

    // Custom query methods using Spring Data JPA conventions

    // Find authors by nationality
    List<Author> findByNationality(String nationality);

    // Find authors born before a certain date
    List<Author> findByBirthDateBefore(java.time.LocalDate date);

    // Find authors by name (case-insensitive search)
    List<Author> findByNameContainingIgnoreCase(String name);
}

