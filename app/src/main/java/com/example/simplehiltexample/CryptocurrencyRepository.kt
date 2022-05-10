package com.example.simplehiltexample

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}