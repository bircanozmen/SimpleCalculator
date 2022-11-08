package com.bircanozmen.simplecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var number1:Int?=null
    var number2: Int?=null
    var result: Int?=null
    // There is no certainty whether the number will be written or not so we put ? (question mark) to machine understand.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view: View){

        number1= editText1.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            Toast.makeText(applicationContext,"Enter a number",Toast.LENGTH_LONG).show()

        }else{
            result= number1!!+number2!!
            resultText.text="Result: ${result}"
        }


    }
    fun mySub(view: View){
        number1= editText1.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            Toast.makeText(applicationContext,"Enter a number",Toast.LENGTH_LONG).show()
        }else{
            result= number1!!-number2!!
            resultText.text="Result: ${result}"
        }

    }
    fun myMultiply(view: View){
        number1= editText1.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            Toast.makeText(applicationContext,"Enter a number",Toast.LENGTH_LONG).show()
        }else{
            result= number1!!*number2!!
            resultText.text="Result: ${result}"
        }

    }
    fun myDiv(view: View){
        number1= editText1.text.toString().toIntOrNull()
        number2=editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            Toast.makeText(applicationContext,"Enter a number",Toast.LENGTH_LONG).show()
        }else{
            result= number1!!/number2!!
            resultText.text="Result: ${result}"
        }

    }
}