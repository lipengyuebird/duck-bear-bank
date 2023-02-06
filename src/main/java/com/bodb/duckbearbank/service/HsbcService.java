package com.bodb.duckbearbank.service;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.dao.feign.HsbcFeignClient;
import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.stereotype.Service;

@Service
public class HsbcService extends BaseService {

    private final HsbcFeignClient hsbcFeignClient;

    public HsbcService(HsbcFeignClient hsbcFeignClient) {
        this.hsbcFeignClient = hsbcFeignClient;
    }

    @Override
    public ExchangeRate getExchangeRate(Currency baseCurrency, Currency currency) {
        return hsbcFeignClient.getExchangeRate(baseCurrency, currency);
    }

}
