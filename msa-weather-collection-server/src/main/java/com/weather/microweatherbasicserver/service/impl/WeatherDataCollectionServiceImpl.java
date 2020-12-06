package com.weather.microweatherbasicserver.service.impl;

import com.weather.microweatherbasicserver.utils.RedisUtils;
import com.weather.microweatherbasicserver.service.WeatherDataCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

    private static final String WEATHER_URL = "http://wthrcdn.etouch.cn/weather_mini?";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RedisUtils redisUtils;

    @Override
    public void synDataByCityId(String cityId) {
        String url = WEATHER_URL+"citykey="+cityId;
        updateWeatherDateForRedis(url);
    }

    public void updateWeatherDateForRedis(String url) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        String strBody =null;
        if(responseEntity.getStatusCodeValue()==200) {
            strBody = responseEntity.getBody();
        }
        redisUtils.set(url, strBody, 0);
    }
}
