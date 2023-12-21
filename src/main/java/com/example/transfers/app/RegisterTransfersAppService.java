package com.example.transfers.app;

import com.example.transfers.model.Transfers;
import com.example.transfers.repository.TransfersRepository;
import com.example.transfers.usecase.RegisterTransfersUseCase;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor

@Service
@Transactional
public class RegisterTransfersAppService implements RegisterTransfersUseCase {

    private final TransfersRepository transfersRepository;

    @Override
    public void handle(RegisterTransfers command) {
        Transfers transfer = Transfers.builder()
                .banco(command.getBanco())
                .agencia(command.getAgencia())
                .conta(command.getConta())
                .tipoConta(command.getTipoConta())
                .documento(command.getDocumento())
                .valor(command.getValor())
                .data(command.getData())
                .build();

        transfersRepository.save(transfer);
    }
}
