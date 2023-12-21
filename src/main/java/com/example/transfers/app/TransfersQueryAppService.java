package com.example.transfers.app;

import com.example.transfers.model.TransfersQuery;
import com.example.transfers.repository.TransfersQueryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class TransfersQueryAppService {

    private final TransfersQueryRepository transfersQueryRepository;

    public List<TransfersQuery> getAll() {
        return (List<TransfersQuery>) transfersQueryRepository.findAll();
    }

    public TransfersQuery getById(UUID id) {
        return transfersQueryRepository.get(id);
    }

}
