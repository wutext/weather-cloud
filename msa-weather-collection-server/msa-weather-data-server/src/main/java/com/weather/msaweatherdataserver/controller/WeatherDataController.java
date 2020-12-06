package com.weather.msaweatherdataserver.controller;

import com.weather.msaweatherdataserver.entity.WeatherResponse;
import com.weather.msaweatherdataserver.service.WeatherDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@Slf4j
public class WeatherDataController {

    @Autowired
    private WeatherDataService weatherDataService;

    @RequestMapping("/cityId/{id}")
    public WeatherResponse getWeatherById(@PathVariable("id") String id) {
        return weatherDataService.getDataByCityId(id);
    }

    @RequestMapping("/cityName/{name}")
    public WeatherResponse getWeatherByName(@PathVariable("name") String name) {
        return weatherDataService.getDataByCityName(name);
    }

}
