package com.example.currencyconverter.domain.models

import com.example.currencyconverter.domain.entity.Currency

data class Rate(
    val currency: Currency,
    val value: Double,
    val balance: Double?
)
