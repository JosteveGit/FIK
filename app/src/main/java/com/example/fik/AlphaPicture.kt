package com.example.fik

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_alpha_picture.*
import kotlinx.android.synthetic.main.activity_alpha_picture.back
import kotlinx.android.synthetic.main.activity_select_alphabet.*
import java.util.*

class AlphaPicture : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var tts: TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha_picture)

        tts = TextToSpeech(this, this)

        image.setOnClickListener {
            speakOut("A P P L E Apple")
        }

        when (intent.getStringExtra("letter")) {
            "A" -> {
                image.setImageResource(R.drawable.apple)
                image.setOnClickListener {
                    speakOut("A P P L E Apple")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("apple", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "B" -> {
                image.setImageResource(R.drawable.bird)
                image.setOnClickListener {
                    speakOut("B I R D bird")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("bird", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "C" -> {
                image.setImageResource(R.drawable.cup)
                image.setOnClickListener {
                    speakOut("C U P cup")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("cup", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "D" -> {
                image.setImageResource(R.drawable.dog)
                image.setOnClickListener {
                    speakOut("D O G dog")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("dog", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "E" -> {
                image.setImageResource(R.drawable.elepjant)
                image.setOnClickListener {
                    speakOut("E L E P H A N T elephant")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("elephant", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "F" -> {
                image.setImageResource(R.drawable.fish)
                image.setOnClickListener {
                    speakOut("F I S H fish")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("fish", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "G" -> {
                image.setImageResource(R.drawable.gun)
                image.setOnClickListener {
                    speakOut("G U N gun")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("gun", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "H" -> {
                image.setImageResource(R.drawable.horse)
                image.setOnClickListener {
                    speakOut("H O R S E horse")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().trim().contains("horse", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "I" -> {
                image.setImageResource(R.drawable.icecream)
                image.setOnClickListener {
                    speakOut("I C E C R E A M icecream hmmmm")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().trim().contains("ice", ignoreCase = true) || answer.text.toString().trim().contains("cream", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "J" -> {
                image.setImageResource(R.drawable.jug)
                image.setOnClickListener {
                    speakOut("J U G jug")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("jug", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "K" -> {
                image.setImageResource(R.drawable.kangaroo)
                image.setOnClickListener {
                    speakOut("K A N G A R O O kangaroo")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("kangaroo", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "L" -> {
                image.setImageResource(R.drawable.lion)
                image.setOnClickListener {
                    speakOut("L I O N lion")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("lion", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "M" -> {
                image.setImageResource(R.drawable.monkey)
                image.setOnClickListener {
                    speakOut("M O N K E Y monkey")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("monkey", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "N" -> {
                image.setImageResource(R.drawable.nail)
                image.setOnClickListener {
                    speakOut("N A I L nail")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("nail", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "O" -> {
                image.setImageResource(R.drawable.orange)
                image.setOnClickListener {
                    speakOut("O R A N G E orange")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("orange", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "P" -> {
                image.setImageResource(R.drawable.pot)
                image.setOnClickListener {
                    speakOut("P O T pot")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("pot", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "Q" -> {
                image.setImageResource(R.drawable.queen)
                image.setOnClickListener {
                    speakOut(" Q U E E N queen")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("queen", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "R" -> {
                image.setImageResource(R.drawable.rat)
                image.setOnClickListener {
                    speakOut("R A T rat")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("rat", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "S" -> {
                image.setImageResource(R.drawable.saw)
                image.setOnClickListener {
                    speakOut("S A W saw")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("saw", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "T" -> {
                image.setImageResource(R.drawable.table)
                image.setOnClickListener {
                    speakOut("T A B L E table")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("table", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "U" -> {
                image.setImageResource(R.drawable.umbrella)
                image.setOnClickListener {
                    speakOut("U M B R E L L A umbrella")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("umbrella", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "V" -> {
                image.setImageResource(R.drawable.vase)
                image.setOnClickListener {
                    speakOut("V A S E vase")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("vase", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "W" -> {
                image.setImageResource(R.drawable.window)
                image.setOnClickListener {
                    speakOut("W I N D O W window")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("window", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "X" -> {
                image.setImageResource(R.drawable.xyk)
                image.setOnClickListener {
                    speakOut("X Y L O P H O N E xylophone")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("xylophone", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "Y" -> {
                image.setImageResource(R.drawable.yatch)
                image.setOnClickListener {
                    speakOut("Y A T C H yatch")
                }
//                submit.setOnClickListener {
//                    if(answer.text.toString().contains("yacht", ignoreCase = true)){
//                        Toast.correct(this)
//                    }else{
//                        Toast.wrong(this)
//                    }
//                }
            }
            "Z" -> {
                image.setImageResource(R.drawable.zebra)
                image.setOnClickListener {
                    speakOut("Z E B R A zebra")
                }
            }
        }

        back.setOnClickListener { onBackPressed() }


    }

    class Toast{
        companion object{
            fun correct(context: Context){
                android.widget.Toast.makeText(context, "Correct Answer", android.widget.Toast.LENGTH_SHORT).show()
            }

            fun wrong(context: Context){
                android.widget.Toast.makeText(context, "Wrong Answer", android.widget.Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onInit(status: Int) {
        if(status == TextToSpeech.SUCCESS){
            val result = tts.setLanguage(Locale.UK)

            if(result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                android.widget.Toast.makeText(this, "Language not found or not supported",android.widget.Toast.LENGTH_LONG).show()
            }
        }else{
            Log.e("TTS", "Initialization failed")
        }
    }

    @SuppressLint("NewApi")
    private fun speakOut(value: String){
        Log.d("Speaking","Speaking")
        tts.setSpeechRate(0.5f)
        tts.speak(value, TextToSpeech.QUEUE_FLUSH, null, "")
    }




}
