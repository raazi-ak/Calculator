package com.raazi.calculator
import net.objecthunter.exp4j.ExpressionBuilder



data class Calc(var input: String)

class CalcRepo( ){
    private var _input: Calc = Calc("")
    var inputString = _input.input
     fun append(funInput: String): String {
        inputString = inputString.plus(funInput)
         return inputString
    }

    fun evaluate(): String {
         inputString=  ExpressionBuilder(inputString).build().evaluate().toString()
        return inputString

    }
    fun backspace(){
        inputString= inputString.dropLast(1)
    }

}