package com.example.libraryApp.controller;

import com.example.libraryApp.dao.Author;
import com.example.libraryApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomePage {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("home")
    public String test(){
        return "from test controller1";
    }

    @GetMapping("getAll")
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }
}
