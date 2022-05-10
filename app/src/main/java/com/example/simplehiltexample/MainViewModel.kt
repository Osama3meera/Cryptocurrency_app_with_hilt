package com.example.simplehiltexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val cryptocurrencyRepository: CryptocurrencyRepository
) : ViewModel() {
    private val cryptocurrencyEmitter = MutableLiveData<List<Cryptocurrency>>()
    val cryptoCurrency: LiveData<List<Cryptocurrency>> = cryptocurrencyEmitter

    init {
        loadCryptocurrency()
    }

    private fun loadCryptocurrency() {
        cryptocurrencyEmitter.value = cryptocurrencyRepository.getCryptoCurrency()
    }
}