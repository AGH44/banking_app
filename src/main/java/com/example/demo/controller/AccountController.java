package com.example.demo.controller;


import com.example.demo.models.Account;
import com.example.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

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

    @PostMapping("/{id}/deposit")
    public Account deposit(@PathVariable Long id , @RequestBody Map< String ,  Double > request){
      Double amount = request.get("amount");
      return accountService.deposit(id,amount);
    }

    @PostMapping("/{id}/withdraw")
    public Account withdraw(@PathVariable Long id , @RequestBody Map< String ,  Double > request){
        Double amount = request.get("amount");
        return accountService.withdraw(id,amount);
    }

}
