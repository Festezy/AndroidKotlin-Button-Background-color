package com.ariqandrean.melihatgambar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_cars1.setOnClickListener {
            iv_cars1.setBackgroundColor(Color.RED)
            iv_cars2.setBackgroundColor(Color.LTGRAY)
            Toast.makeText(this, "Ini mobile pertama", Toast.LENGTH_SHORT).show()
        }
        iv_cars2.setOnClickListener {
            iv_cars2.setBackgroundColor(Color.GREEN)
            iv_cars1.setBackgroundColor(Color.GRAY)
            Toast.makeText(this, "Ini mobile Kedua", Toast.LENGTH_SHORT).show()
        }
    }
}