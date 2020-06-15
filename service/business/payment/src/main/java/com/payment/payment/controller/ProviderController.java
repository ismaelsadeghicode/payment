package com.payment.payment.controller;


import com.payment.payment.domain.Provider;
import com.payment.payment.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    ProviderRepository repository;

    @GetMapping
    public ResponseEntity find(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public  ResponseEntity save(@RequestBody Provider provider){

        return ResponseEntity.ok(repository.save(provider));
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Provider provider){

        return ResponseEntity.ok(repository.save(provider));
    }

    @DeleteMapping
    public void delete(@RequestBody Provider provider){

        repository.delete(provider);
    }

    @PatchMapping
    public ResponseEntity modify(@RequestBody Provider provider){

        return ResponseEntity.ok(repository.save(provider));
    }
}
