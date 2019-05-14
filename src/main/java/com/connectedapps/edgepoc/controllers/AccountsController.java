package com.connectedapps.edgepoc.controllers;

import com.connectedapps.edgepoc.models.Account;
import com.connectedapps.edgepoc.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/accounts")
public class AccountsController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/{id}")
    public Account get(@PathVariable("id") Long id)
    {
        Optional<Account> account = accountRepository.findById(id);
        return account.isPresent() ? account.get(): new Account();
    }

    /*
    @GetMapping
    public List<Account> list(){
        List<Account> list = new ArrayList<Account>();
        return list;
    }
    */
}
