package com.example.bookmyshow.repositories;

import com.example.bookmyshow.models.ShowSeat;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;

import java.sql.SQLOutput;
import java.util.List;

public class ShowSeatsRepository {
    public ShowSeat findShowSeatById(Long id){
        return null;
    }

    public List<ShowSeat> findAllById(List<Long> showSeats) {
        return null;
    }
    public void save(ShowSeat showSeatId){
        System.out.println("Seat has been blocked");
    }
}
