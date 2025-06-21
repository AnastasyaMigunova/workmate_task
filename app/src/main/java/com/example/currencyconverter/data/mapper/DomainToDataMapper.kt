package com.example.currencyconverter.data.mapper

import com.example.currencyconverter.data.dataSource.room.account.dbo.AccountDbo
import com.example.currencyconverter.data.dataSource.room.transaction.dbo.TransactionDbo
import com.example.currencyconverter.domain.entity.Currency
import com.example.currencyconverter.domain.models.Account
import com.example.currencyconverter.domain.models.Transaction
import javax.inject.Inject

class DomainToDataMapper @Inject constructor() {
    fun Transaction.toData(): TransactionDbo =
        TransactionDbo(
            id = id,
            from = from.name,
            to = to.name,
            fromAmount = fromAmount,
            toAmount = toAmount,
            dateTime = dateTime
        )

    fun Account.toData(): AccountDbo =
        AccountDbo(
            code = code.name,
            amount = amount
        )
}