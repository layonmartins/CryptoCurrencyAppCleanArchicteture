package com.layon.cryptocurrencyappyt.domain.repository

import com.layon.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.layon.cryptocurrencyappyt.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}