package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.dataSource.room.transaction.dao.TransactionDao
import com.example.currencyconverter.data.mapper.DataToDomainMapper
import com.example.currencyconverter.data.mapper.DomainToDataMapper
import com.example.currencyconverter.domain.models.Transaction
import com.example.currencyconverter.domain.repository.TransactionsRepository
import javax.inject.Inject

class TransactionsRepositoryImpl @Inject constructor(
    private val transactionDao: TransactionDao,
    private val dataToDomainMapper: DataToDomainMapper,
    private val domainToDataMapper: DomainToDataMapper
) : TransactionsRepository {
    override suspend fun addTransaction(transaction: Transaction) {
        val transactionDbo = domainToDataMapper.run { transaction.toData() }
        return transactionDao.insertAll(transactionDbo)
    }

    override suspend fun getTransactions(): List<Transaction> {
        return transactionDao.getAll().map { transactionDbo ->
            dataToDomainMapper.run { transactionDbo.toDomain() }
        }
    }
}