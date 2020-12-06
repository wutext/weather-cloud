package com.weather.msaweatherreportserver.api.fallback;

import com.weather.msaweatherreportserver.api.DataWeatherApi;
import com.weather.msaweatherreportserver.entity.WeatherResponse;
import com.weather.msaweatherreportserver.entity.citybean.City;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class DataWeatherFallBack implements DataWeatherApi{
    @Override
    public List<City> cityList() {
        log.error("城市获取失败");
        return null;
    }

    @Override
    public WeatherResponse getWeatherById(String id) {
        log.error("天气数据获取失败");
        return new WeatherResponse();
    }
}
