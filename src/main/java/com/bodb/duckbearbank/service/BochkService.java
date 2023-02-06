package com.bodb.duckbearbank.service;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.dao.feign.BochkFeignClient;
import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.stereotype.Service;

@Service
public class BochkService extends BaseService {

    private final BochkFeignClient bochkFeignClient;

    public BochkService(BochkFeignClient bochkFeignClient) {
        this.bochkFeignClient = bochkFeignClient;
    }

    @Override
    public ExchangeRate getExchangeRate(Currency baseCurrency, Currency currency) {
        return bochkFeignClient.getExchangeRate(baseCurrency, currency);
    }

}
