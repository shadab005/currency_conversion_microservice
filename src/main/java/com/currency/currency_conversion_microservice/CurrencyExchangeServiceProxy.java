package com.currency.currency_conversion_microservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="forex-service",url="localhost:8000")
@FeignClient(name="forex-service")
@RibbonClient(name="forex-service")
@Component
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/forex/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}