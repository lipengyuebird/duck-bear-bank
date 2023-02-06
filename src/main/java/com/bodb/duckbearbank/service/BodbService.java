package com.bodb.duckbearbank.service;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.dao.feign.HsbcFeignClient;
import com.bodb.duckbearbank.dao.sqlite.ExchangeRateRepository;
import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.stereotype.Service;

@Service
public class BodbService extends BaseService {

    private final ExchangeRateRepository repository;

    private final HsbcFeignClient hsbcFeignClient;

    public BodbService(ExchangeRateRepository repository, HsbcFeignClient hsbcFeignClient) {
        this.repository = repository;
        this.hsbcFeignClient = hsbcFeignClient;
    }


    @Override
    public ExchangeRate getExchangeRate(Currency baseCurrency, Currency currency) {
        return repository.findFirstByBaseCurrencyAndCurrencyOrderByLastUpdatedDesc(baseCurrency.name(), currency.name());
    }

    public ExchangeRate saveExchangeRate(ExchangeRate exchangeRate) {
        return repository.save(exchangeRate);
    }

    public String getHistory() {
        return hsbcFeignClient.getHistory();
    }
}
