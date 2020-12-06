package com.weather.msaweatherreportserver.api;

import com.weather.msaweatherreportserver.entity.citybean.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "msa-weather-city-server")
public interface CityDataApi {

    @GetMapping("/city/cityList")
    List<City> cityList();
}
