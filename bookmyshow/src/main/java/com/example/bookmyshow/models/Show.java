package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show extends BaseModel{
    private int startTime;
    private int endTime;
    private Screen screen;
    private Movie movie;
}
