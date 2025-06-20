package com.example.currencyconverter.data.mapper

import com.example.currencyconverter.data.dataSource.remote.dto.RateDto
import com.example.currencyconverter.data.dataSource.room.account.dbo.AccountDbo
import com.example.currencyconverter.data.dataSource.room.transaction.dbo.TransactionDbo
import com.example.currencyconverter.domain.entity.Currency
import com.example.currencyconverter.domain.models.Account
import com.example.currencyconverter.domain.models.Rate
import com.example.currencyconverter.domain.models.Transaction
import javax.inject.Inject

class DataToDomainMapper @Inject constructor() {

    fun RateDto.toDomain(balance: Double = 0.0): Rate =
        Rate(
            currency = Currency.valueOf(currency),
            value = value,
            balance = balance
        )

    fun AccountDbo.toDomain(): Account =
        Account(
            currency = Currency.valueOf(code),
            amount = amount
        )

    fun TransactionDbo.toDomain(): Transaction =
        Transaction(
            id = id,
            from = Currency.valueOf(from),
            to = Currency.valueOf(to),
            fromAmount = fromAmount,
            toAmount = toAmount,
            dateTime = dateTime
        )
}