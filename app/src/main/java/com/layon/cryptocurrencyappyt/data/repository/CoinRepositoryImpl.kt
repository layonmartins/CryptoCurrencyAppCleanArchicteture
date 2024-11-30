package com.layon.cryptocurrencyappyt.data.repository

import com.layon.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.layon.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.layon.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.layon.cryptocurrencyappyt.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}