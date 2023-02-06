package com.bodb.duckbearbank.dao.feign;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("hsbc")
public interface HsbcFeignClient {
    @GetMapping("/rate")
    ExchangeRate getExchangeRate(@RequestParam Currency baseCurrency, @RequestParam Currency currency);

    @GetMapping("/history")
    String getHistory();
}
