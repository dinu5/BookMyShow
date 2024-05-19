package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Ticket {
    private int number;
    private User user;
    private Show show;
    private List<ShowSeat> showSeats;
    private int price;
    private TicketStatus ticketStatus;
    private List<Payment> payments;
}
