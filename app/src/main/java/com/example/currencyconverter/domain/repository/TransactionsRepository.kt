package com.example.currencyconverter.domain.repository

import com.example.currencyconverter.domain.models.Transaction

interface TransactionsRepository {
    suspend fun addTransaction(transaction: Transaction)
    suspend fun getTransactions(): List<Transaction>
}