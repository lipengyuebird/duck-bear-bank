package com.bodb.duckbearbank.controller;

import com.bodb.duckbearbank.dao.sqlite.ExchangeRateRepository;
import com.bodb.duckbearbank.entity.ExchangeRate;
import com.bodb.duckbearbank.service.BochkService;
import com.bodb.duckbearbank.service.BodbService;
import com.bodb.duckbearbank.service.HangSengService;
import com.bodb.duckbearbank.service.HsbcService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/rate")
public class ExchangeRateController {

    private final HsbcService hsbcService;

    private final HangSengService hangSengService;

    private final BochkService bochkService;

    private final BodbService bodbService;
    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateController(HsbcService hsbcService, HangSengService hangSengService, BochkService bochkService, BodbService bodbService,
                                  ExchangeRateRepository exchangeRateRepository) {
        this.hsbcService = hsbcService;
        this.hangSengService = hangSengService;
        this.bochkService = bochkService;
        this.bodbService = bodbService;
        this.exchangeRateRepository = exchangeRateRepository;
    }

    @GetMapping()
    public Map<String, ExchangeRate> rate(
            @RequestParam("base_currency") String baseCurrency,
            @RequestParam("currency") String currency
    ) {
        return new HashMap<String, ExchangeRate>(8) {{
            put("hsbc", hsbcService.getExchangeRate(baseCurrency, currency));
            put("hang_seng", hangSengService.getExchangeRate(baseCurrency, currency));
            put("bochk", bochkService.getExchangeRate(baseCurrency, currency));
            put("bodb", bodbService.getExchangeRate(baseCurrency, currency));
        }};
    }

}
