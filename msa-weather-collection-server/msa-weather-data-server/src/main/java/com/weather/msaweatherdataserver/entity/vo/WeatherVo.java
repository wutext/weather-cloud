package com.weather.msaweatherdataserver.entity.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@Getter
@Setter
@ToString
public class WeatherVo implements Serializable{

    private static final Long serialVersionUID=1L;
    private String city;
    private String api;
    private String ganmao;
    private String wendu;
    private Yesterday yesterday;
    private List<Forecast> forecast;
}
