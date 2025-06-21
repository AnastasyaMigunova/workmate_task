package com.example.currencyconverter.domain.repository

import com.example.currencyconverter.domain.models.Account
import kotlinx.coroutines.flow.Flow

interface AccountsRepository {
    suspend fun getAccounts(): List<Account>
    fun getAccountsFlow(): Flow<List<Account>>
    suspend fun updateAccount(account: Account)
}
