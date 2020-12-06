package com.weather.msaweatherreportserver.api;

import com.weather.msaweatherreportserver.entity.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "msa-weathere-data-server")
public interface WeatherDataApi {

    @RequestMapping("/weather/cityId/{id}")
    public WeatherResponse getWeatherById(@PathVariable("id") String id);
}
