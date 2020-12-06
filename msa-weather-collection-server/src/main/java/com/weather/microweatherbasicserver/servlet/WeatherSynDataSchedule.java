package com.weather.microweatherbasicserver.servlet;

import com.netflix.discovery.converters.Auto;
import com.weather.microweatherbasicserver.api.CityDataApi;
import com.weather.microweatherbasicserver.entity.City;
import com.weather.microweatherbasicserver.service.WeatherDataCollectionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class WeatherSynDataSchedule {

    @Autowired
    private CityDataApi cityDataApi;

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

//    @Scheduled(cron = "0 0 0/1 * * ?")
    @Scheduled(cron = "0/60 * * * * ?")
    public void weatherSynData() {

        List<City> cityList = cityDataApi.cityList();
        for(City c:cityList) {
            weatherDataCollectionService.synDataByCityId(c.getCityId());
            log.info("城市：{} 更新到数据库", c.getCityName());
        }
    }
}
