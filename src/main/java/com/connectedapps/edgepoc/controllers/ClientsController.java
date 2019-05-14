package com.connectedapps.edgepoc.controllers;

import com.connectedapps.edgepoc.models.Account;
import com.connectedapps.edgepoc.models.Client;
import com.connectedapps.edgepoc.repositories.AccountRepository;
import com.connectedapps.edgepoc.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/clients")
public class ClientsController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    AccountRepository accountRepository;

    @GetMapping
    public List<Client> list()
    {
        return clientRepository.findAll();
    }

    @GetMapping("/{clientId}/accounts")
    public List<Account> getAccounts(@PathVariable("clientId") Long clientId)
    {
        Account account = new Account();
        account.setClientId(clientId);

        Example<Account> accountExample = Example.of(account);
        Iterable<Account> accounts = accountRepository.findAll(accountExample);

        return (List<Account>) accounts;
    }
}
