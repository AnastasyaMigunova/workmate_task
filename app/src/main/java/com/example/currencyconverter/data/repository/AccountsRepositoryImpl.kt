package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.dataSource.room.account.dao.AccountDao
import com.example.currencyconverter.data.mapper.DataToDomainMapper
import com.example.currencyconverter.data.mapper.DomainToDataMapper
import com.example.currencyconverter.domain.models.Account
import com.example.currencyconverter.domain.repository.AccountsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AccountsRepositoryImpl(
    private val accountDao: AccountDao,
    private val dataToDomainMapper: DataToDomainMapper,
    private val domainToDataMapper: DomainToDataMapper
): AccountsRepository {
    override suspend fun getAccounts(): List<Account> {
        return accountDao.getAll().map { accountDbo ->
            dataToDomainMapper.run { accountDbo.toDomain() }
        }
    }

    override fun getAccountsFlow(): Flow<List<Account>> {
        return accountDao.getAllAsFlow().map { accountDbo ->
            accountDbo.map { dbo ->
                dataToDomainMapper.run { dbo.toDomain() }
            }
        }
    }

    override suspend fun updateAccount(account: Account) {
        val accountDbo = domainToDataMapper.run { account.toData() }
        return accountDao.insertAll(accountDbo)
    }
}