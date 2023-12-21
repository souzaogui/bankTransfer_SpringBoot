package com.example.transfers.controller;

import com.example.transfers.usecase.RegisterTransfersUseCase;
import com.example.transfers.usecase.RegisterTransfersUseCase.RegisterTransfers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping(path = "/api/transfers")
public class TransfersController {

    private final RegisterTransfersUseCase registerTransfersUseCase;

    @PostMapping(path = "/register")
    public void registerTransfers(@RequestBody RegisterTransfers transfers) {
        registerTransfersUseCase.handle(transfers);
    }

}
