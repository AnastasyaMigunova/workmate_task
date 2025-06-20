package com.example.currencyconverter.domain.repository

import com.example.currencyconverter.domain.entity.Currency
import com.example.currencyconverter.domain.models.Rate

interface RatesRepository {
    suspend fun getRates(base: Currency, amount: Double): List<Rate>
}