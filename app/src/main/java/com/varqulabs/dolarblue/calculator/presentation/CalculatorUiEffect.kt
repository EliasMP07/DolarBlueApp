package com.varqulabs.dolarblue.calculator.presentation

sealed class CalculatorUiEffect {

    data class ShowError(val message: String) : CalculatorUiEffect()

    data object NavigateToHistory : CalculatorUiEffect()
}