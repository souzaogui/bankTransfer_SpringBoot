package com.example.transfers.repository;

import com.example.transfers.model.Transfers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransfersRepository extends CrudRepository<Transfers, UUID> {
}
