package com.example.transfers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.transfers.model.Transfers;

@Repository
public interface TransfersRepository extends CrudRepository<Transfers, Integer> {
}
