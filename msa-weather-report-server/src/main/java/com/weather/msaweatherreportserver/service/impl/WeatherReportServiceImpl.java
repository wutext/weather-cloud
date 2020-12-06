package com.weather.msaweatherreportserver.service.impl;

import com.weather.msaweatherreportserver.entity.vo.WeatherVo;
import com.weather.msaweatherreportserver.service.WeatherReportService;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Override
    public WeatherVo getWeatherResponse(String cityId) {
        /*return weatherDataService.getDataByCityId(cityId);*/

        return new WeatherVo();
    }
}
