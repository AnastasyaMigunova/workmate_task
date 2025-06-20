package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.dataSource.remote.RatesService
import com.example.currencyconverter.data.dataSource.remote.RemoteRatesServiceImpl
import com.example.currencyconverter.domain.entity.Currency
import com.example.currencyconverter.domain.models.Rate
import javax.inject.Inject

class GetCurrencyRatesUseCase @Inject constructor(
    private val ratesService: RatesService
) {
    suspend operator fun invoke(base: Currency, amount: Double): List<Rate> =
        ratesService.getRates(base, amount)
}