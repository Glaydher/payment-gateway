package org.example.domain.valueobjects;

import java.util.Objects;

public class OrderId {

    private final String value;

    public OrderId(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Order ID must not be null or empty.");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderId orderId = (OrderId) o;
        return Objects.equals(value, orderId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
