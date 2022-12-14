package com.example.tapcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var counter = 0
    private var incrementBy = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter += incrementBy;
            textView.text = counter.toString()
            // when the counter hits 100, show the upgrade button
            if (counter >= 100) {
                // set upgrade button visibility to visible
                if(incrementBy == 1) {
                    upgradeButton.visibility = View.VISIBLE
                }
            }
        }

        upgradeButton.setOnClickListener {
            // when upgrade button is clicked, starfish button adds 2 everytime
            incrementBy = 2
            // set upgradeButton to invisible after the upgrade has been made
            upgradeButton.visibility = View.INVISIBLE
        }

    }
}