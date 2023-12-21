package com.example.transfers.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@NoArgsConstructor

@Entity(name = "TransferQuery")
@Table(name = "transferencias")
public class TransfersQuery {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "banco")
    private String banco;

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "conta")
    private String conta;

    @Column(name = "documento")
    private String documento;

    @Column(name = "tipoConta")
    private String tipoConta;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data")
    private ZonedDateTime data;

    @JsonIgnore
    @Column(name = "codigoTransferencia")
    private String codigoTransferencia;

    public static class TransferIdNotFound extends RuntimeException {
        private static final long serialVersionUUID = 7231298231298231298L;
    }
}
