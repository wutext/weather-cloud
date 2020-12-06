package com.weather.msaweatherreportserver.controller;

import com.netflix.discovery.converters.Auto;
import com.weather.msaweatherreportserver.api.CityDataApi;
import com.weather.msaweatherreportserver.api.WeatherDataApi;
import com.weather.msaweatherreportserver.entity.citybean.City;
import com.weather.msaweatherreportserver.entity.vo.Forecast;
import com.weather.msaweatherreportserver.entity.vo.WeatherVo;
import com.weather.msaweatherreportserver.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherReportController {

    @Autowired
    private CityDataApi cityDataApi;

    @Autowired
    private WeatherDataApi weatherDataApi;
    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/report/{cityId}")
    public ModelAndView reportWeatherDate(@PathVariable("cityId") String cityId, Model model) {

        List<City> cityListcity = cityDataApi.cityList();

        model.addAttribute("title","音乐天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityListcity);
        model.addAttribute("report", /*weatherDataApi.getWeatherById(cityId)*/null);
        return new ModelAndView("weather/reportView", "reportModel", model);
    }
}
