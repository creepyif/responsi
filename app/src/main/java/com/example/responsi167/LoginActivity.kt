package com.example.responsi167

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_login.setOnClickListener {
            val user = user.text.toString()
            val password = password.text.toString()

            if(user == "admin" && password == "123"){

                val intent = Intent (this,HomeActivity::class.java)
                startActivity(intent)

            }
            else{
                Toast.makeText(this@LoginActivity, "Email atau password salah",   Toast.LENGTH_SHORT).show()

            }
        }
        daftar.setOnClickListener {
            val intent = Intent (this,RegisterActivity::class.java)
            startActivity(intent)
            }
        }
    }

