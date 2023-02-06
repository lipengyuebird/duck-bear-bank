package com.bodb.duckbearbank.service;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.entity.ExchangeRate;

public abstract class BaseService {

    /**
     * Get exchange rate by currency enum.
     * @param baseCurrency Base currency enum
     * @param currency Currency enum
     * @return
     */
    public abstract ExchangeRate getExchangeRate(Currency baseCurrency, Currency currency);

    /**
     * Get exchange rate by currency string.
     * @param baseCurrency Base currency string
     * @param currency Currency string
     * @return
     */
    public ExchangeRate getExchangeRate(String baseCurrency, String currency) {
        return this.getExchangeRate(Currency.valueOf(baseCurrency), Currency.valueOf(currency));
    }

}
