package edu.uw.ischool.phariha.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnGo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        btnGo = this.findViewById<Button>(R.id.btnGo)
        btnGo.setOnClickListener { it ->
            count++
            if (count == 1)
                btnGo.text = "You have pushed me $count time!"
            else
                btnGo.text = "You have pushed me $count times!"
        }

    }
}