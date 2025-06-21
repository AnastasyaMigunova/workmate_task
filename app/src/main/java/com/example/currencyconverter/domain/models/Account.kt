package com.example.currencyconverter.domain.models

import com.example.currencyconverter.domain.entity.Currency

data class Account(
    val code: Currency,
    val amount: Double
)
