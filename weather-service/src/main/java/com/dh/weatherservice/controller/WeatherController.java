package com.dh.weatherservice.controller;

import com.dh.weatherservice.service.WeatherServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherServiceImpl weatherService;

    public WeatherController(WeatherServiceImpl weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Double mockTemperature(@RequestParam String city, @RequestParam String country) {
        return weatherService.mockTemperature(city, country);
    }

}