package com.weather.microweatherbasicserver.entity;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    private String cityId;
    private String cityName;
    private String cityCode;
    private String province;
}
