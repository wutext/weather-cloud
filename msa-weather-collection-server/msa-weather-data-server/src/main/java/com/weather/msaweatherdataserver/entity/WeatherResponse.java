package com.weather.msaweatherdataserver.entity;

import com.weather.msaweatherdataserver.entity.vo.WeatherVo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Data
@Getter
@Setter
@ToString
public class WeatherResponse implements Serializable{

    private static final long serialVersionUID=1L;
    private WeatherVo data;
    private Integer status;
    private String desc;
}
