package com.example.currencyconverter.ui.currency_screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.ContainerHost
import javax.inject.Inject
import org.orbitmvi.orbit.viewmodel.container

//data class CurrencyState(
//    val isLoading: Boolean = false,
//    val baseCurrency: String = "USD",
//    val rates: List<RateDto> = emptyList(),
//    val errorMessage: String? = null
//)
//
//sealed class CurrencySideEffect {
//    data class ShowError(val message: String) : CurrencySideEffect()
//}
//
//@HiltViewModel
//class CurrencyViewModel @Inject constructor(
//
//) : ContainerHost<CurrencyState, CurrencySideEffect>, ViewModel() {
//    override val container = container<CurrencyState, CurrencySideEffect>(CurrencyState())
//}