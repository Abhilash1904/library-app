package com.example.libraryApp.controller;

import com.example.libraryApp.dao.Author;
import com.example.libraryApp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController()
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/home")
    public String test(){
        return "from test controller1";
    }

    @GetMapping("/getAll")
    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable("id") Integer Id){
        return authorRepository.findById(Id);
    }

    @PostMapping("/addNewAuthor")
    public ResponseEntity<Author> addNewAuthor(@RequestBody Author author){
        try {
            Author savedAuthor = authorRepository.save(author);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedAuthor); // 201 Created
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); // 400 Bad Request
        }
    }

    @PutMapping("/updateAuthor")
    public String updateAuthor(@RequestBody Author author){
        Optional<Author> avlAuthor = authorRepository.findById(author.getAuthorId());
        if(avlAuthor.isPresent()){
            authorRepository.saveAndFlush(author);
            return "Author is updated";
        }else{
            return "Author does not exists";
        }
    }

//    implement patch mapping
}

