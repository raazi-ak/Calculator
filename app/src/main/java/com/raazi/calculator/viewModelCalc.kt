package com.raazi.calculator

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel(){

    private var _calcRepo : CalcRepo = CalcRepo()

     var inputString = mutableStateOf(_calcRepo.inputString)
    var formulaString = mutableStateOf("")
    var scrollLinearIncrease: Int= 0

    fun appendInput(funInput: String){
        _calcRepo.append(funInput)
        inputString.value = _calcRepo.inputString
        scrollLinearIncrease++

    }

    fun evaluateInput(){

        formulaString.value=inputString.value.plus("=")
       inputString.value= _calcRepo.evaluate()


    }

    fun clearAll(){
        _calcRepo.inputString=""
        inputString.value=""
        formulaString.value=""
    }
    fun backspace(){
        _calcRepo.backspace()
        inputString.value=_calcRepo.inputString
        scrollLinearIncrease--
    }
}