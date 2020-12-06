package com.weather.msaweatherdataserver.service.impl;

import com.weather.msaweatherdataserver.entity.WeatherResponse;
import com.weather.msaweatherdataserver.service.WeatherDataService;
import com.weather.msaweatherdataserver.utils.GsonUtil;
import com.weather.msaweatherdataserver.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    private static final String WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String url = WEATHER_URL+"citykey="+cityId;
        return doGetWeather(url);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String url = WEATHER_URL+"city="+cityName;
        return doGetWeather(url);
    }

    private WeatherResponse doGetWeather(String url) {
        String redisObject = redisUtils.get(url, 0);
        if(!StringUtils.isEmpty(redisObject)) {
            return GsonUtil.gsonToBean(redisObject, WeatherResponse.class);
        }else {
            throw new RuntimeException(" Data is not exists");
        }
    }
}
