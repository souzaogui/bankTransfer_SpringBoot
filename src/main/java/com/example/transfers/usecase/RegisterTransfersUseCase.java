package com.example.transfers.usecase;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface RegisterTransfersUseCase {

    void handle(RegisterTransfers command);

    @Value
    @Builder
    class RegisterTransfers {

        String banco;

        String agencia;

        String conta;

        String documento;

        String tipoConta;

        BigDecimal valor;

        ZonedDateTime data;
    }

}
