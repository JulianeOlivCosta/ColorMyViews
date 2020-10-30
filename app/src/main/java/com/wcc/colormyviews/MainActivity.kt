package com.wcc.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* // plug in no build gradle para acessar o botao direto pelo ID

class MainActivity : AppCompatActivity() {

    var currentColor = R.color.gray


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorButtonAction()
        setBoxColor()//chama método que irá trocar a cor do botao ao clicar
    }

    private fun setBoxColor() {
        box_one_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_two_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_three_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_four_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_five_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
    }

    private fun setColorButtonAction() {
        redButton.setOnClickListener{
            currentColor = R.color.red
        }
        yellowButton.setOnClickListener{
            currentColor = R.color.yellow
        }
        greenButton.setOnClickListener{
            currentColor = R.color.green
        }
    }
}