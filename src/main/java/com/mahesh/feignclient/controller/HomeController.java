package com.mahesh.feignclient.controller;

import com.mahesh.feignclient.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
  @Autowired
  WeatherService weatherService;

  @GetMapping
  public Object get(){
    return weatherService.get();
  }
}
