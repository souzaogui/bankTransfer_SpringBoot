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
public final class UsersId extends SimpleValueObject<UUID> implements Serializable {

    @Serial
    private static final long serialVersionUID = 830013460662846275L;

    public static final String ATTR = "value";

    public static final UsersId NAO_INFORMADO = new UsersId();

    @JsonValue
    private final UUID value;

    private UsersId() {
        this.value = null;
    }

    private UsersId(UUID value) {
        this.value = requireNonNull(value);
    }

    public static UsersId generate() {
        return new UsersId(UUID.randomUUID());
    }

    public static UsersId from(UUID uuid) {
        return new UsersId(uuid);
    }

    @JsonCreator
    public static UsersId from(String uuid) {
        return new UsersId(UUID.fromString(uuid));
    }

    public boolean isValid() {
        return isValid(this) && value != null;
    }

    public static boolean isValid(UsersId value) {
        return !NAO_INFORMADO.equals(value);
    }
}