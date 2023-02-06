package com.bodb.duckbearbank.service;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.dao.feign.HangSengFeignClient;
import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.stereotype.Service;

@Service
public class HangSengService extends BaseService {

    private final HangSengFeignClient hangSengFeignClient;

    public HangSengService(HangSengFeignClient hangSengFeignClient) {
        this.hangSengFeignClient = hangSengFeignClient;
    }

    @Override
    public ExchangeRate getExchangeRate(Currency baseCurrency, Currency currency) {
        return hangSengFeignClient.getExchangeRate(baseCurrency, currency);
    }

}
