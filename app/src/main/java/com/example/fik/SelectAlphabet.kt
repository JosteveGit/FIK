package com.example.fik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_select_alphabet.*

class SelectAlphabet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_alphabet)

        a_button.setOnClickListener {
            Intent(this, AlphaPicture::class.java).apply {
                putExtra("letter", "A")
                startActivity(this)
            }
        }

        b_button.setOnClickListener {
            Intent(this, AlphaPicture::class.java).apply {
                putExtra("letter", "B")
                startActivity(this)
            }
        }

        c_button.setOnClickListener {
            Intent(this, AlphaPicture::class.java).apply {
                putExtra("letter", "C")
                startActivity(this)
            }
        }

        d_button.setOnClickListener {
            Intent(this, AlphaPicture::class.java).apply {
                putExtra("letter", "D")
                startActivity(this)
            }
        }

        back.setOnClickListener { onBackPressed() }
    }
}
