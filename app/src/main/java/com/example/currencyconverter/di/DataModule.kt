package com.example.currencyconverter.di

import com.example.currencyconverter.data.dataSource.remote.RatesService
import com.example.currencyconverter.data.dataSource.room.account.dao.AccountDao
import com.example.currencyconverter.data.mapper.DataToDomainMapper
import com.example.currencyconverter.data.repository.RatesRepositoryImpl
import com.example.currencyconverter.domain.repository.RatesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun provideRatesRepository(
        ratesService: RatesService,
        accountDao: AccountDao,
        dataToDomainMapper: DataToDomainMapper
    ): RatesRepository =
        RatesRepositoryImpl(ratesService, accountDao, dataToDomainMapper)
}