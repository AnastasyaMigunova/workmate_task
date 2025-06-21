package com.example.currencyconverter.di

import com.example.currencyconverter.domain.repository.AccountsRepository
import com.example.currencyconverter.domain.repository.RatesRepository
import com.example.currencyconverter.domain.repository.TransactionsRepository
import com.example.currencyconverter.domain.usecase.GetAccountsUseCase
import com.example.currencyconverter.domain.usecase.GetRatesUseCase
import com.example.currencyconverter.domain.usecase.GetTransactionsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DomainModule {
    @Provides
    fun provideGetAccountsUseCase(
       accountsRepository: AccountsRepository
    ): GetAccountsUseCase =
        GetAccountsUseCase(accountsRepository)

    @Provides
    fun provideGetRatesUseCase(
        ratesRepository: RatesRepository
    ): GetRatesUseCase =
        GetRatesUseCase(ratesRepository)

    @Provides
    fun provideGetTransactionsUseCase(
        transactionsRepository: TransactionsRepository
    ): GetTransactionsUseCase =
        GetTransactionsUseCase(transactionsRepository)
}