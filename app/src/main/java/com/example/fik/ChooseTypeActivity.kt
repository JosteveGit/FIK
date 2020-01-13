package com.example.fik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_type.*

class ChooseTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_type)

        alphabetGameType.setOnClickListener{
            gotoSelectDifficulty(GameType.Alphabet)
        }

        numberGameType.setOnClickListener{
            gotoSelectDifficulty(GameType.Number)
        }

        settings.setOnClickListener {
            startActivity(Intent(this,SettingsActivity::class.java))
        }
    }

    enum class GameType{
        Alphabet, Number
    }

    private fun gotoSelectDifficulty(type: GameType){
        val intent = Intent(this,SelectAlphabet::class.java).apply {
           putExtra(
               "type",
               when(type){
                   GameType.Alphabet -> "Alphabet"
                   GameType.Number -> "Number"
               }
           )
        }
        startActivity(intent)
    }
}


