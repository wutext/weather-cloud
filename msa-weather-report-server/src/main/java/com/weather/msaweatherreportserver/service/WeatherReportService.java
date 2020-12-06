package com.weather.msaweatherreportserver.service;

import com.weather.msaweatherreportserver.entity.WeatherResponse;
import com.weather.msaweatherreportserver.entity.vo.WeatherVo;

public interface WeatherReportService {

    WeatherVo getWeatherResponse(String cityId);
}
