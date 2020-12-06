package com.weather.msaweatherdataserver.service;


import com.weather.msaweatherdataserver.entity.WeatherResponse;

public interface WeatherDataService {

    /**
     * 根据城市ID获取天气信息
     * @param cityId
     * @return
     */
    WeatherResponse getDataByCityId(String cityId);

    /**
     * 根据城市name获取天气信息
     * @param cityName
     * @return
     */
    WeatherResponse getDataByCityName(String cityName);
}
