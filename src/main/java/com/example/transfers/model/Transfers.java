package com.example.transfers.model;

import com.example.sk.identifiers.TransfersId;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import static java.util.Objects.requireNonNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)

@Entity
@Table(name = "transferencias")
public class Transfers {

    @EmbeddedId
    @AttributeOverride(name = TransfersId.ATTR, column = @Column(name = "id"))
    private final TransfersId id;

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

    Transfers(TransfersBuilder builder) {
        this.id = requireNonNull(builder.id);
        this.banco = requireNonNull(builder.banco);
        this.agencia = requireNonNull(builder.agencia);
        this.conta = requireNonNull(builder.conta);
        this.documento = requireNonNull(builder.documento);
        this.tipoConta = requireNonNull(builder.tipoConta);
        this.valor = requireNonNull(builder.valor);
        this.data = requireNonNull(builder.data);
        this.codigoTransferencia = requireNonNull(builder.codigoTransferencia);
    }

    public static TransfersBuilder builder() {
        return new TransfersBuilder();
    }
}
