package com.weather.msaweatherreportserver.entity.citybean;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    private String cityId;
    private String cityName;
    private String cityCode;
    private String province;
}
