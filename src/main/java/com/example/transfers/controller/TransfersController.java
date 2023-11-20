package com.example.transfers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.transfers.model.Transfers;
import com.example.transfers.repository.TransfersRepository;

@RestController
@RequestMapping(path = "/api/transfers")
public class TransfersController {

    @Autowired
    TransfersRepository transfersRepository;

    // TODO: Get

    @GetMapping(path = "/")
    public String validate() {
        return "Transferências Online";
    }

    @GetMapping(path = "/list-all")
    public List<Transfers> getListUsers() {
        return (List<Transfers>) transfersRepository.findAll();
    }


}
