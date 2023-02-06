package com.bodb.duckbearbank.dao.feign;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("bochk")
public interface BochkFeignClient {
    @GetMapping("/rate")
    ExchangeRate getExchangeRate(@RequestParam Currency baseCurrency, @RequestParam Currency currency);

}
