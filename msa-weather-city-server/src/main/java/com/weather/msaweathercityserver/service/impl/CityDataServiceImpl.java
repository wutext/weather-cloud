package com.weather.msaweathercityserver.service.impl;

import com.weather.msaweathercityserver.entity.citybean.City;
import com.weather.msaweathercityserver.entity.citybean.CityList;
import com.weather.msaweathercityserver.service.CityDataService;
import com.weather.msaweathercityserver.utils.XmlBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CityDataServiceImpl implements CityDataService {

    @Override
    public List<City> getDataCityLList() {

        Resource resource = new ClassPathResource("citylist.xml");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
            StringBuffer buffer = new StringBuffer();
            String line;
            while((line=br.readLine())!=null ) {
                buffer.append(line);
            }
            br.close();
            //将xml城市信息映射为实体
            CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class,buffer.toString());
            return cityList.getCityList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
