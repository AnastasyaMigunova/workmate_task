package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.domain.repository.AccountsRepository
import javax.inject.Inject

class GetAccountsUseCase @Inject constructor(
    private val accountsRepository: AccountsRepository
) {
    suspend operator fun invoke() = accountsRepository.getAccounts()
    fun asFlow() = accountsRepository.getAccountsFlow()
}