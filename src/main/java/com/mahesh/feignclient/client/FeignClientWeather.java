package com.mahesh.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "json", url = "https://jsonplaceholder.typicode1.com/todos/1", fallbackFactory = FallbackFeignClientWeather.class)
public interface FeignClientWeather {
  @GetMapping()
  public Object get();
}
