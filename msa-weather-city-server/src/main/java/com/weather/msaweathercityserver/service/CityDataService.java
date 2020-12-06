package com.weather.msaweathercityserver.service;

import com.weather.msaweathercityserver.entity.citybean.City;

import java.util.List;

public interface CityDataService {

    /**
     * 获取城市信息
     * @return
     */
    List<City> getDataCityLList();
}
