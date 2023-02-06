package com.bodb.duckbearbank.dao.sqlite;

import com.bodb.duckbearbank.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author perye
 */
@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

     ExchangeRate findFirstByBaseCurrencyAndCurrencyOrderByLastUpdatedDesc(
             String baseCurrency, String currency
     );

}
