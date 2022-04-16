package com.example.hiltexamplegeeks

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}