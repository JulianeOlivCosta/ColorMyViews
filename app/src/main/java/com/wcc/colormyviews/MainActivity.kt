package com.wcc.colormyviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* // plug in no build gradle para acessar o botao direto pelo ID

class MainActivity : AppCompatActivity() {

    var currentColor = R.color.gray
    var boxOneColor = R.color.gray

    //fazer a mesma ação com as outras caixas
    var boxTwoColor = R.color.gray
    var boxThreeColor = R.color.gray
    var boxFourColor = R.color.gray
    var boxFiveColor = R.color.gray


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)

        val color = sharedPreferences.getInt("color_box_one", R.color.gray)
        box_one_test.setBackgroundResource(color)

        val colorTwo = sharedPreferences.getInt("color_box_two", R.color.gray)
        box_two_test.setBackgroundResource(colorTwo)

        val colorThree = sharedPreferences.getInt("color_box_three", R.color.gray)
        box_two_test.setBackgroundResource(colorThree)

        val colorFour = sharedPreferences.getInt("color_box_four", R.color.gray)
        box_two_test.setBackgroundResource(colorFour)

        val colorFive = sharedPreferences.getInt("color_box_five", R.color.gray)
        box_two_test.setBackgroundResource(colorFive)

        setColorButtonAction()
        setBoxColor()//chama método que irá trocar a cor do botao ao clicar
    }

    override fun onStop() {
        super.onStop()
        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val sharedPreferencesEditor = sharedPreferences.edit()

        sharedPreferencesEditor.putInt("color_box_one", boxOneColor )

        sharedPreferencesEditor.putInt("color_box_two", boxTwoColor)
        sharedPreferencesEditor.putInt("color_box_three", boxThreeColor)
        sharedPreferencesEditor.putInt("color_box_four", boxFourColor)
        sharedPreferencesEditor.putInt("color_box_five", boxFiveColor)

        sharedPreferencesEditor.apply()

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
    private fun setBoxColor() {
        box_one_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxOneColor = currentColor

        }
        box_two_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxTwoColor = currentColor
        }
        box_three_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxThreeColor = currentColor
        }
        box_four_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxFourColor = currentColor

        }
        box_five_test.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxFiveColor = currentColor
        }
    }
}