package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.dataSource.remote.RatesService
import com.example.currencyconverter.data.dataSource.room.account.dao.AccountDao
import com.example.currencyconverter.data.mapper.DataToDomainMapper
import com.example.currencyconverter.domain.entity.Currency
import com.example.currencyconverter.domain.models.Rate
import com.example.currencyconverter.domain.repository.RatesRepository
import javax.inject.Inject

class RatesRepositoryImpl @Inject constructor(
    private val remote: RatesService,
    private val accountDao: AccountDao,
    private val dataToDomainMapper: DataToDomainMapper
) : RatesRepository {
    override suspend fun getRates(base: Currency, amount: Double): List<Rate> {
        val rates = remote.getRates(base.name, amount)
        val accounts = accountDao.getAll().associateBy { Currency.valueOf(it.code) }

        return rates.map { rate ->
            val balance = accounts[Currency.valueOf(rate.currency)]?.amount ?: 0.0
            dataToDomainMapper.run {
                rate.toDomain(balance)
            }
        }
    }
}