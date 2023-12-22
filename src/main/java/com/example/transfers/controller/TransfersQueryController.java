package com.example.transfers.controller;

import com.example.transfers.app.TransfersQueryAppService;
import com.example.transfers.model.TransfersQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor

@RestController
@RequestMapping(path = "/query/api/transfers")
public class TransfersQueryController {

    private final TransfersQueryAppService transfersQueryAppService;

    @GetMapping(path = "/")
    public String validate() {
        return "API Transferências Online";
    }

    @GetMapping(path = "/list-all")
    public List<TransfersQuery> getListAllTransfers() {
        return transfersQueryAppService.getAll();
    }

    @GetMapping(path = "/{id}")
    public TransfersQuery getTransferById(@PathVariable UUID id) {
        return transfersQueryAppService.getById(id);
    }
}
