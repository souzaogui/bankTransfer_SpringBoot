package com.example.validation;

import java.io.Serializable;
import java.util.Objects;

public abstract class SimpleValueObject<T extends Serializable> {

    public abstract T getValue();

    public static <T extends SimpleValueObject<?>> boolean nonNullValue(T value) {
        return Objects.nonNull(value) && Objects.nonNull(value.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !getClass().equals(obj.getClass())) return false;

        @SuppressWarnings("unchecked")
        SimpleValueObject<T> other = (SimpleValueObject<T>) obj;
        return Objects.equals(getValue(), other.getValue());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [value=" + getValue() + "]";
    }

    /**
     * Call, directly, the <code>toString()</code> from the internal value.
     *
     * @return the internal value as string.
     */
    public String asString() {
        return getValue().toString();
    }
}