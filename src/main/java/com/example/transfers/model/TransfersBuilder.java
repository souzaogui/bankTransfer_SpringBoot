package com.example.transfers.model;

import com.example.sk.identifiers.TransfersId;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.ZonedDateTime;
import java.util.Base64;

public class TransfersBuilder {

    protected TransfersId id;

    protected String banco;

    protected String agencia;

    protected String conta;

    protected String documento;

    protected String tipoConta;

    protected BigDecimal valor;

    protected ZonedDateTime data;

    protected String codigoTransferencia;

    public TransfersBuilder banco(String banco) {
        this.banco = banco;
        return this;
    }

    public TransfersBuilder agencia(String agencia) {
        this.agencia = agencia;
        return this;
    }

    public TransfersBuilder conta(String conta) {
        this.conta = conta;
        return this;
    }

    public TransfersBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public TransfersBuilder tipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
        return this;
    }

    public TransfersBuilder valor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public TransfersBuilder data(ZonedDateTime data) {
        this.data = data;
        return this;
    }

    public Transfers build() {

        id = TransfersId.generate();

        byte[] bytes = gerarBytes();
        codigoTransferencia = code(bytes);

        return new Transfers(this);
    }

    public static byte[] gerarBytes() {
        byte[] bytes = new byte[50];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(bytes);
        return bytes;
    }

    public static String code(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }
}
