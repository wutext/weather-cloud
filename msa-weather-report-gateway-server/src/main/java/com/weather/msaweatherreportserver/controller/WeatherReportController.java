package com.weather.msaweatherreportserver.controller;

import com.weather.msaweatherreportserver.api.DataWeatherApi;
import com.weather.msaweatherreportserver.entity.citybean.City;
import com.weather.msaweatherreportserver.service.WeatherReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherReportController {

    @Autowired
    private DataWeatherApi dataWeatherApi;

    @GetMapping("/report/{cityId}")
    public ModelAndView reportWeatherDate(@PathVariable("cityId") String cityId, Model model) {

        List<City> cityList = dataWeatherApi.cityList();

        model.addAttribute("title","音乐天气预报");
        model.addAttribute("cityId", cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", dataWeatherApi.getWeatherById(cityId).getData());
        return new ModelAndView("weather/reportView", "reportModel", model);
    }
}
