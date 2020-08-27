package com.mahesh.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "json", url = "https://jsonplaceholder.typicode.com/todos/1")
public interface FeignClientWeather {
  @GetMapping()
  public Object get();
}
