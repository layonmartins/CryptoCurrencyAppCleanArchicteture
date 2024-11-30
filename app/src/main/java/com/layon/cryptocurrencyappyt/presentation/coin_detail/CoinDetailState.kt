package com.layon.cryptocurrencyappyt.presentation.coin_detail

import com.layon.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)