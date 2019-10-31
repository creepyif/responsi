package com.example.responsi167

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        var nama: EditText = findViewById(R.id.nama_reg)
        var usern: EditText = findViewById(R.id.user_reg)
        var pass: EditText = findViewById(R.id.pass_reg)

        btn_reg.setOnClickListener() {
            intent = Intent(this, AccountActivity::class.java)
            intent.putExtra("nama", nama.getText())
            intent.putExtra("email", usern.getText())
            intent.putExtra("passw", pass.getText())
            startActivity(intent)

            Toast.makeText(this, "Berhasil Registrasi",   Toast.LENGTH_SHORT).show()
        }


    }
}