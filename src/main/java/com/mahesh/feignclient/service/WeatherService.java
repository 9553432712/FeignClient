package com.mahesh.feignclient.service;

import com.mahesh.feignclient.client.FeignClientWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
  @Autowired
  FeignClientWeather feignClientWeather;

  public Object get(){
    return feignClientWeather.get();
  }

}
