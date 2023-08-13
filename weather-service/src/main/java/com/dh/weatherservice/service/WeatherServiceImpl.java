package com.dh.weatherservice.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService{

    @Override
    public Double mockTemperature(String city, String country) {
        return 20.0;
    }

}