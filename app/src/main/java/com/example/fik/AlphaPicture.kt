package com.example.fik

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_alpha_picture.*
import kotlinx.android.synthetic.main.activity_alpha_picture.back
import kotlinx.android.synthetic.main.activity_select_alphabet.*

class AlphaPicture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha_picture)

        when (intent.getStringExtra("letter")) {
            "A" -> {
                image.setImageResource(R.drawable.apple)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("apple", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "B" -> {
                image.setImageResource(R.drawable.bird)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("bird", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "C" -> {
                image.setImageResource(R.drawable.cup)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("cup", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "D" -> {
                image.setImageResource(R.drawable.dog)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("dog", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "E" -> {
                image.setImageResource(R.drawable.elepjant)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("elephant", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "F" -> {
                image.setImageResource(R.drawable.fish)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("fish", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "G" -> {
                image.setImageResource(R.drawable.gun)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("gun", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "H" -> {
                image.setImageResource(R.drawable.horse)
                submit.setOnClickListener {
                    if(answer.text.toString().trim().contains("horse", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "I" -> {
                image.setImageResource(R.drawable.icecream)
                submit.setOnClickListener {
                    if(answer.text.toString().trim().contains("ice", ignoreCase = true) || answer.text.toString().trim().contains("cream", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "J" -> {
                image.setImageResource(R.drawable.jug)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("jug", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "K" -> {
                image.setImageResource(R.drawable.kangaroo)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("kangaroo", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "L" -> {
                image.setImageResource(R.drawable.lion)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("lion", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "M" -> {
                image.setImageResource(R.drawable.monkey)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("monkey", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "N" -> {
                image.setImageResource(R.drawable.nail)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("nail", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "O" -> {
                image.setImageResource(R.drawable.orange)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("orange", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "P" -> {
                image.setImageResource(R.drawable.pot)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("pot", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "Q" -> {
                image.setImageResource(R.drawable.queen)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("queen", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "R" -> {
                image.setImageResource(R.drawable.rat)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("rat", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "S" -> {
                image.setImageResource(R.drawable.saw)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("saw", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "T" -> {
                image.setImageResource(R.drawable.table)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("table", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "U" -> {
                image.setImageResource(R.drawable.umbrella)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("umbrella", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "V" -> {
                image.setImageResource(R.drawable.vase)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("vase", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "W" -> {
                image.setImageResource(R.drawable.window)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("window", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "X" -> {
                image.setImageResource(R.drawable.xyk)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("xylophone", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "Y" -> {
                image.setImageResource(R.drawable.yatch)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("yacht", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
                }
            }
            "Z" -> {
                image.setImageResource(R.drawable.zebra)
                submit.setOnClickListener {
                    if(answer.text.toString().contains("zebra", ignoreCase = true)){
                        Toast.correct(this)
                    }else{
                        Toast.wrong(this)
                    }
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


}
