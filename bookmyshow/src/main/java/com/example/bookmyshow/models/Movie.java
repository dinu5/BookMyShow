package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.List;


@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    List<SupportedFeature> features;
}
