package com.example.myapplicationtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1:Button = findViewById(R.id.button_1);
        button1.setOnClickListener{
            Toast.makeText(this,"hahaha",Toast.LENGTH_SHORT).show();
        }
        val button2:Button = findViewById(R.id.button_2);
        button2.setOnClickListener(){
            val intent:Intent = Intent(this,SeActivity::class.java)
            startActivity(intent);
        }

    }



}