package com.currency.currency_conversion_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.currency.currency_conversion_microservice")
public class CurrencyConversionMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionMicroserviceApplication.class, args);
    }
}
