package com.weather.msaweathercityserver.controller;

import com.weather.msaweathercityserver.entity.citybean.City;
import com.weather.msaweathercityserver.service.CityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/citys")
public class CityDataController {

    @Autowired
    private CityDataService cityDataService;

    @RequestMapping("/cityList")
    public List<City> cityList() {
        return cityDataService.getDataCityLList();
    }
}
