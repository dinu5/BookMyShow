package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatTypePrice {
    private Show show;
    private SeatType seatType;
    private int price;
}
