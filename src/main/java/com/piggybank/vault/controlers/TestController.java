package com.piggybank.vault.controlers;


import com.piggybank.vault.dao.UserRepo;
import com.piggybank.vault.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> getUser(){
        return userRepo.findAll();
    }
}
