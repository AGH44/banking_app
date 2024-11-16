package com.example.demo.services;


import com.example.demo.Repository.AccountRepository;
import com.example.demo.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository ;

    public Account createAccount (Account account){
        return accountRepository.save(account);
    }

    public Optional<Account> getAccount( Long id){
        return accountRepository.findById(id);
    }

    public Account deposit (Long id , double amount){
        Account account =  getAccount(id).orElseThrow(()-> new RuntimeException("Account Not Found"));
        account.setBalance(account.getBalance()+amount);
        return accountRepository.save(account);
    }

    public Account withdraw (Long id , double amount) {
        Account account =  getAccount(id).orElseThrow(()-> new RuntimeException("Account Not Found"));
        if(account.getBalance()< amount)
           throw new RuntimeException("Filed opertaion");
        else {
            account.setBalance(account.getBalance()-amount);
            return accountRepository.save(account);
        }
    }
}
