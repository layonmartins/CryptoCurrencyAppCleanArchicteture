package com.layon.cryptocurrencyappyt.presentation.coin_list.components

import com.layon.cryptocurrencyappyt.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)