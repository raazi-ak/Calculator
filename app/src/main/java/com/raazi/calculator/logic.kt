package com.raazi.calculator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CalculatorLogic(input: String){
    var buffer by remember {
        mutableStateOf("")
    }
    buffer= buffer+input
}