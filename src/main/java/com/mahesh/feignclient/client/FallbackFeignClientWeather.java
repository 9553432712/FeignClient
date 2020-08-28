package com.mahesh.feignclient.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
class FallbackFeignClientWeather implements FallbackFactory<FeignClientWeather> {
  @Override
  public FeignClientWeather create(Throwable cause) {
    return new FeignClientWeather() {
      @Override
      public Object get() {
        return new String("" + cause.getMessage());
      }
    };
  }
}
