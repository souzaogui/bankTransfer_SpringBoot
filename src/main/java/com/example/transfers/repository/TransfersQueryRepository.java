package com.example.transfers.repository;

import com.example.transfers.model.TransfersQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface TransfersQueryRepository extends CrudRepository<TransfersQuery, UUID> {

    Optional<TransfersQuery> findById(UUID id);

    default TransfersQuery get(UUID id) {
        return findById(id)
                .orElseThrow(TransfersQuery.TransferIdNotFound::new);
    }
}
