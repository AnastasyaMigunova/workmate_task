package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.domain.entity.Currency
import com.example.currencyconverter.domain.models.Rate
import com.example.currencyconverter.domain.repository.RatesRepository
import javax.inject.Inject

class GetRatesUseCase @Inject constructor(
    private val ratesRepository: RatesRepository
) {
   suspend operator fun invoke(base: Currency, amount: Double): List<Rate> =
        ratesRepository.getRates(base, amount)
}