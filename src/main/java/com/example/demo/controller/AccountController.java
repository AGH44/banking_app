package com.example.demo.controller;


import com.example.demo.models.Account;
import com.example.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping ("/add")
    public Account createAccount (@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @GetMapping("/{id}")
    public Account getAccount (@PathVariable Long id){
        return accountService.getAccount(id).orElseThrow( ()-> new RuntimeException("user not found"));
    }


}
