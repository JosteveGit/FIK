package com.example.fik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alpha_picture.*

class AlphaPicture : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha_picture)

        val letter = intent.getStringExtra("letter")
        when(letter){
            "A" -> {
                image.setImageResource(R.drawable.apple)
            }
            "B" -> {
                image.setImageResource(R.drawable.bird)
            }
            "C" -> {
                image.setImageResource(R.drawable.cup)
            }
            "D" -> {
                image.setImageResource(R.drawable.dog)
            }
        }

        back.setOnClickListener { onBackPressed() }
    }

}
