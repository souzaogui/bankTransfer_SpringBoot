package com.example.sk.identifiers;

import com.example.validation.SimpleValueObject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

import static java.util.Objects.requireNonNull;

@Getter
@Embeddable
public final class TransfersId extends SimpleValueObject<UUID> implements Serializable {

    @Serial
    private static final long serialVersionUID = 830013460662846275L;

    public static final String ATTR = "value";

    public static final TransfersId NAO_INFORMADO = new TransfersId();

    @JsonValue
    private final UUID value;

    private TransfersId() {
        this.value = null;
    }

    private TransfersId(UUID value) {
        this.value = requireNonNull(value);
    }

    public static TransfersId generate() {
        return new TransfersId(UUID.randomUUID());
    }

    public static TransfersId from(UUID uuid) {
        return new TransfersId(uuid);
    }

    @JsonCreator
    public static TransfersId from(String uuid) {
        return new TransfersId(UUID.fromString(uuid));
    }

    public boolean isValid() {
        return isValid(this) && value != null;
    }

    public static boolean isValid(TransfersId value) {
        return !NAO_INFORMADO.equals(value);
    }
}