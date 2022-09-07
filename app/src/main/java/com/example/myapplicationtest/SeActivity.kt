package com.example.myapplicationtest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_se)


        val button: Button = findViewById(R.id.button_url)
        button.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW);
            intent.data = Uri.parse("https://www.baidu.com");
            startActivity(intent)
        }
    }
}