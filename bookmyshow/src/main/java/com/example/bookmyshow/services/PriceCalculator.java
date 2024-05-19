package com.example.bookmyshow.services;

import com.example.bookmyshow.models.SeatType;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.ShowSeatTypePrice;
import com.example.bookmyshow.repositories.ShowSeatTypePriceRepository;

import java.util.List;

public class PriceCalculator {
    private ShowSeatTypePriceRepository showSeatTypePriceRepository;
    PriceCalculator(ShowSeatTypePriceRepository showSeatTypePriceRepository){
        this.showSeatTypePriceRepository = showSeatTypePriceRepository;
    }
    public int calculatePrice(Show show, List<ShowSeat> showSeats){
        int amount = 0;
        List<ShowSeatTypePrice> showSeatTypePrices = showSeatTypePriceRepository.findByShow(show);
        for(ShowSeat showSeat : showSeats){
            for(ShowSeatTypePrice showSeatTypePrice : showSeatTypePrices){
                if(showSeatTypePrice.getSeatType().equals(showSeat.getSeat().getSeatType())){
                    amount += showSeatTypePrice.getPrice();
                    break;
                }
            }
        }
        return amount;
    }

}
