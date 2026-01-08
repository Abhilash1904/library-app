package com.example.libraryApp.dao;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "author_id")
    Integer  authorId;

    @Column( name = "name")
    String name;

    @Column(name = "birth_date")
    Date birthDate;

    @Column(name = "nationality")
    String nationality;

    // Getters and Setters
    public Integer  getAuthorId() { return authorId; }

    public void setAuthorId(Integer authorId) { this.authorId = authorId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getNationality() { return nationality; }

    public void setNationality(String nationality) { this.nationality = nationality; }

    public Date getBirthDate() { return birthDate; }

    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
}
