package com.edigest.journalApp.service;

import com.edigest.journalApp.API.Responce.WeatherResponce;
import com.edigest.journalApp.Constants.Placeholders;
import com.edigest.journalApp.cache.Appcache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}") //if we want to keep the api key safe so we add it to .yml file and gives the @value annotation ans add $ before the path
    private  String apiKey; //it cannot be static


    @Autowired
    private RestTemplate restTemplate;

   @Autowired
   private Appcache AppCache;

    public WeatherResponce getweather(String city) {
        String finalAPI = AppCache.appCache.get(Appcache.Keys.WEATHER_API.toString()).replace(Placeholders.CITY,city).replace(Placeholders.API_KEY,apiKey);
        ResponseEntity<WeatherResponce> response = restTemplate.exchange(finalAPI, HttpMethod.POST, null, WeatherResponce.class);//json to pogo
        WeatherResponce body=response.getBody();
        return body;
    }


}
