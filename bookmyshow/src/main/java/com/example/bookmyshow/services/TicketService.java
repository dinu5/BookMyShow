package com.example.bookmyshow.services;

import com.example.bookmyshow.models.*;
import com.example.bookmyshow.repositories.ShowRepository;
import com.example.bookmyshow.repositories.ShowSeatsRepository;
import com.example.bookmyshow.repositories.TicketRepository;
import com.example.bookmyshow.repositories.UserRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TicketService {
    private UserRepository userRepository;
    private ShowSeatsRepository showSeatsRepository;
    private ShowRepository showRepository;
    private PriceCalculator priceCalculator;
    private TicketRepository ticketRepository;
    TicketService(UserRepository userRepository,ShowSeatsRepository showSeatsRepository,
                  ShowRepository showRepository, PriceCalculator priceCalculator,
                  TicketRepository ticketRepository){
        this.userRepository = userRepository;
        this.showSeatsRepository = showSeatsRepository;
        this.showRepository = showRepository;
        this.priceCalculator = priceCalculator;
        this.ticketRepository = ticketRepository;
    }
    @Transactional //using this annotation so that only one thread can access
    public Ticket bookTicket(Long userId, List<Long> showSeats,Long showId){
        User user = userRepository.findUserById(userId);
        List<ShowSeat> showSeatList = showSeatsRepository.findAllById(showSeats);
        Show show = showRepository.findShowById(showId);
        if(show==null){
            throw new RuntimeException("Invalid show id");
        }
        for(ShowSeat showSeat : showSeatList){
            if(!showSeat.getSeatStatus().equals(SeatStatus.AVAILABLE)){
                throw new RuntimeException("something went wrong");
            }
        }
        // Block the seats
        for(ShowSeat showSeat : showSeatList){
            showSeat.setSeatStatus(SeatStatus.BLOCKED);
            // save to the db
            showSeatsRepository.save(showSeat);
        }
        int amount = priceCalculator.calculatePrice(show,showSeatList);
        Ticket ticket = new Ticket();
        ticket.setTicketStatus(TicketStatus.PENDING);
        ticket.setUser(user);
        ticket.setShow(show);
        ticket.setNumber(1000022);
        ticket.setPrice(amount);
        return ticketRepository.save(ticket);

    }
}
