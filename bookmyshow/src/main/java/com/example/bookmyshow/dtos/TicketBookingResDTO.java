package com.example.bookmyshow.dtos;

import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.models.TicketStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketBookingResDTO {
    Ticket ticket;
    TicketStatus ticketStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}
