package com.example.finalv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.dare_button)
        button.setOnClickListener {
            val dare = generateDare()
            val dareTextView = findViewById<TextView>(R.id.dare_text_view)
            dareTextView.text = dare
        }
    }

    fun generateDare(): String {
        val dares = arrayOf("Sing a song in public (without music)","Do the worm dance on the floor" , "Wear your shirt backward for the rest of the day" ,
        "Tell a funny joke to a stranger" , "Do a handstand for at least 5 seconds" , "Take a selfie with a random stranger" , "Eat a spoonful of hot sauce" ,
        "Do a cartwheel in a public place" , "Wear a silly hat for the rest of the day" , "Do the chicken dance in public" , "Ask a stranger for a piggyback ride" ,
        "Make a silly face and take a selfie with it" , "Talk in a funny accent for an hour" , "Draw a picture blindfolded" , "Do 20 jumping jacks in a row" , "Wear mismatched shoes for the rest of the day" ,
        "Tell a funny story from your childhood" , "Make a paper airplane and fly it across the room" , "Dance in the rain (if it's raining outside)" , "Do a silly dance for 30 seconds")
        val random = kotlin.random.Random(System.currentTimeMillis())
        return dares[random.nextInt(dares.size)]
    }

}
