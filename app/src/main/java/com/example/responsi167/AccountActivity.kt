package com.example.responsi167


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.account.*
import kotlinx.android.synthetic.main.register.*

class AccountActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)

        val bundle:Bundle? = intent.extras
        val namaa = bundle?.get("nama")
        val emaill = bundle?.get("email")
        val passs = bundle?.get("passw")

        hasilnama.setText(""+namaa)
        hasiluser.setText(""+emaill)
        hasilpass.setText(""+passs)

    }
}