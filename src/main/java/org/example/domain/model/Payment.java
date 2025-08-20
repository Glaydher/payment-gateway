package org.example.domain.model;

import org.example.domain.enums.PaymentMethod;
import org.example.domain.enums.PaymentStatus;
import org.example.domain.enums.Status;
import org.example.domain.valueobjects.Money;
import org.example.domain.valueobjects.OrderId;

import java.time.LocalDateTime;
import java.util.Map;

public class Payment {

    private final OrderId orderId;
    private final Money money;
    private final PaymentMethod paymentMethod;
    private final Payer payer;
    private final Map<String, Object> metadata;
    private final LocalDateTime createdAt;
    private final LocalDateTime updateAt;

    private Status status;
    private PaymentStatus paymentStatus;
    private String authorizationCode;
    private String message;

    public Payment(OrderId orderId, Money money, PaymentMethod paymentMethod, Payer payer, LocalDateTime updateAt, Map<String, Object> metadata) {
        this.orderId = orderId;
        this.money = money;
        this.paymentMethod = paymentMethod;
        this.payer = payer;
        this.createdAt = LocalDateTime.now();
        this.updateAt = updateAt;
        this.metadata = metadata;
    }


}
