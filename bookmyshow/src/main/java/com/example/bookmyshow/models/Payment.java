package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private String refNumber;
    private int amount;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
}
