package com.example.transfers.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "transferencias")
public class Transfers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    @Column(name = "codigoTransferencia")
    private String codigoTransferencia;
}
