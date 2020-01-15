package com.example.fik

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_select_alphabet.*

class SelectAlphabet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_alphabet)

        a_button.setOnClickListener {
            gotoNextPage("A")
        }

        b_button.setOnClickListener {
            gotoNextPage("B")
        }

        c_button.setOnClickListener {
            gotoNextPage("C")
        }

        d_button.setOnClickListener {
            gotoNextPage("D")
        }

        e_button.setOnClickListener { gotoNextPage("E") }
        f_button.setOnClickListener { gotoNextPage("F") }
        g_button.setOnClickListener { gotoNextPage("G") }
        h_button.setOnClickListener { gotoNextPage("H") }
        i_button.setOnClickListener { gotoNextPage("I") }
        j_button.setOnClickListener { gotoNextPage("J") }
        k_button.setOnClickListener { gotoNextPage("K") }
        l_button.setOnClickListener { gotoNextPage("L") }
        m_button.setOnClickListener { gotoNextPage("M") }
        n_button.setOnClickListener { gotoNextPage("N") }
        o_button.setOnClickListener { gotoNextPage("O") }
        p_button.setOnClickListener { gotoNextPage("P") }
        q_button.setOnClickListener { gotoNextPage("Q") }
        r_button.setOnClickListener { gotoNextPage("R") }
        s_button.setOnClickListener { gotoNextPage("S") }
        t_button.setOnClickListener { gotoNextPage("T") }
        u_button.setOnClickListener { gotoNextPage("U") }
        v_button.setOnClickListener { gotoNextPage("V") }
        w_button.setOnClickListener { gotoNextPage("W") }
        x_button.setOnClickListener { gotoNextPage("X") }
        y_button.setOnClickListener { gotoNextPage("Y") }
        z_button.setOnClickListener { gotoNextPage("Z") }


        back.setOnClickListener { onBackPressed() }
        settings.setOnClickListener {
            startActivity(Intent(this,SettingsActivity::class.java))
        }

    }

    private fun gotoNextPage(value: String) {
        Intent(this, AlphaPicture::class.java).apply {
            putExtra("letter", value)
            startActivity(this)
        }
    }
}
