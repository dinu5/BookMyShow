package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.TicketBookingReqDTO;
import com.example.bookmyshow.dtos.TicketBookingResDTO;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.models.TicketStatus;
import com.example.bookmyshow.services.TicketService;

import java.util.List;

public class TicketController {
    TicketService ticketService;
    TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public TicketBookingResDTO bookTicket(TicketBookingReqDTO ticketBookingReqDTO){
        List<Long> showSeats = ticketBookingReqDTO.getShowSeats();
        Long user = ticketBookingReqDTO.getUserId();
        Long showId = ticketBookingReqDTO.getShowId();
        Ticket ticket = ticketService.bookTicket(user,showSeats,showId);
        TicketBookingResDTO ticketBookingResDTO = new TicketBookingResDTO();
        ticketBookingResDTO.setTicket(ticket);
        ticketBookingResDTO.setTicketStatus(TicketStatus.BOOKED);
        return ticketBookingResDTO;
    }
}
