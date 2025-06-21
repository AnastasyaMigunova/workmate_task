package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.domain.models.Transaction
import com.example.currencyconverter.domain.repository.TransactionsRepository
import javax.inject.Inject

class GetTransactionsUseCase @Inject constructor(
    private val transactionsRepository: TransactionsRepository
) {
    suspend operator fun invoke(): List<Transaction> =
        transactionsRepository.getTransactions()
}