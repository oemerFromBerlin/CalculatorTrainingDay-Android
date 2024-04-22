package com.example.trainingdaycalculator

sealed class CalculatorActions {
    data class Number(val number: Int) :CalculatorActions()
    object Clear: CalculatorActions()
    object Delete : CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
    object Calculate: CalculatorActions()
    object Decimal: CalculatorActions()
}