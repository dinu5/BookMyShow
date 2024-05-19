package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel{
    private List<SupportedFeature> supportedFeatures;
    private List<Seat> seats;

}
