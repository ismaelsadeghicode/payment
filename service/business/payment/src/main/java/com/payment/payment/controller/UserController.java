package com.payment.payment.controller;


import com.payment.payment.domain.User;
import com.payment.payment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository repository;


    @GetMapping
    public ResponseEntity find(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity save(@RequestBody User user){

        return ResponseEntity.ok(repository.save(user));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody User user){

        return ResponseEntity.ok(repository.save(user));
    }

    @DeleteMapping
    public void delete(@RequestBody User user){

        repository.delete(user);
    }

    @PatchMapping("{id}")
    public ResponseEntity modify(@PathVariable("id") int id ,@RequestBody User user){

        return ResponseEntity.ok(repository.save(user)); //todo
    }
}
