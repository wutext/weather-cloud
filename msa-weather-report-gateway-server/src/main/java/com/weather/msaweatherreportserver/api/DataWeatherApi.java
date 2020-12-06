package com.weather.msaweatherreportserver.api;

import com.weather.msaweatherreportserver.api.fallback.DataWeatherFallBack;
import com.weather.msaweatherreportserver.entity.WeatherResponse;
import com.weather.msaweatherreportserver.entity.citybean.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="msa-weather-zuul-server", fallback = DataWeatherFallBack.class)
public interface DataWeatherApi {

    @GetMapping("/city/citys/cityList")
    List<City> cityList();

    @RequestMapping("/data/weather/cityId/{id}")
    WeatherResponse getWeatherById(@PathVariable("id") String id);
}
