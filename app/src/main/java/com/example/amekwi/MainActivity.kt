package com.example.amekwi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
lateinit var btnBmi:Button
lateinit var btnsend:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi=findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent=Intent(this,calculatBMIActivity::class.java)
            startActivity(intent)

        }
        btnsend=findViewById(R.id.btnmoney)
        btnsend.setOnClickListener {
            val intent=Intent(this, SEND::class.java)
            startActivity(intent)
        }
    }
}
