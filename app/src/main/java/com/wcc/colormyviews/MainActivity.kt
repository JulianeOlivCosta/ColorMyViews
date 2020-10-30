package com.wcc.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* // plug in no build gradle para acessar o botao direto pelo ID

class MainActivity : AppCompatActivity() {

    var currentColor = R.color.gray


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorButtonAction() //chama método que irá trocar a cor do botao ao clicar
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