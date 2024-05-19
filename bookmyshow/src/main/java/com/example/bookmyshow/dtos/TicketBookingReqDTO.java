package com.example.bookmyshow.dtos;

import com.example.bookmyshow.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TicketBookingReqDTO {
    private Long userId;
    private List<Long> showSeats;
    private Long showId;

    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<Long> showSeats) {
        this.showSeats = showSeats;
    }
}
