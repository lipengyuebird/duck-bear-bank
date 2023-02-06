package com.bodb.duckbearbank.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "exchange_rate")
@Table(name = "exchange_rate")
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "telegraphic_transfer_bank_buy")
    @JsonProperty("telegraphic_transfer_bank_buy")
    private Double telegraphicTransferBankBuy;

    @Column(name = "telegraphic_transfer_bank_sell")
    @JsonProperty("telegraphic_transfer_bank_sell")
    private Double telegraphicTransferBankSell;

    @Column(name = "banknotes_bank_buy")
    @JsonProperty("banknotes_bank_buy")
    private Double banknotesBankBuy;

    @Column(name = "banknotes_bank_sell")
    @JsonProperty("banknotes_bank_sell")
    private Double banknotesBankSell;

    @Column(name = "base_currency")
    @JsonProperty("base_currency")
    private String baseCurrency;

    @Column(name = "currency")
    @JsonProperty("currency")
    private String currency;

    @Column(name = "last_updated")
    @JsonProperty("last_updated")
    private Date lastUpdated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTelegraphicTransferBankBuy() {
        return telegraphicTransferBankBuy;
    }

    public void setTelegraphicTransferBankBuy(Double telegraphicTransferBankBuy) {
        this.telegraphicTransferBankBuy = telegraphicTransferBankBuy;
    }

    public Double getTelegraphicTransferBankSell() {
        return telegraphicTransferBankSell;
    }

    public void setTelegraphicTransferBankSell(Double telegraphicTransferBankSell) {
        this.telegraphicTransferBankSell = telegraphicTransferBankSell;
    }

    public Double getBanknotesBankBuy() {
        return banknotesBankBuy;
    }

    public void setBanknotesBankBuy(Double banknotesBankBuy) {
        this.banknotesBankBuy = banknotesBankBuy;
    }

    public Double getBanknotesBankSell() {
        return banknotesBankSell;
    }

    public void setBanknotesBankSell(Double banknotesBankSell) {
        this.banknotesBankSell = banknotesBankSell;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
