package com.bodb.duckbearbank.controller;

import com.bodb.duckbearbank.constant.Currency;
import com.bodb.duckbearbank.service.BodbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    private final BodbService bodbService;

    public HomeController(BodbService bodbService) {
        this.bodbService = bodbService;
    }

    @GetMapping("/base_ccys")
    public List<Object> getBaseCcys() {
        System.out.println();
        return Arrays.asList(Currency.HKD);
    }

    @GetMapping("/ccys")
    public List<Object> getCcys() {
        return Arrays.asList(Currency.values());
    }

    @GetMapping("/history")
    public String history() {
        return bodbService.getHistory();
    }

}
