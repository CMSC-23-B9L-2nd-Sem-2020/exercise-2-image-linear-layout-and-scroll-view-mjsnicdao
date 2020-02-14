package com.example.nicdao_exer02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.MARVEL_LOGO)
        textView = findViewById(R.id.bio)

        val start: Button = findViewById(R.id.start_button)
        start.setOnClickListener{selectChar()}


        val retry: Button = findViewById(R.id.retry_button)
        retry.setOnClickListener { retryOption() }
    }
    //Randomizes character selection
    private fun selectChar(){
        val randomInt = (1..10).random()

        val drawableResource = when(randomInt) {
            1 -> R.drawable.antman
            2 -> R.drawable.blackpanther
            3 -> R.drawable.blackwidow
            4 -> R.drawable.captainamerica
            5 -> R.drawable.drstrange
            6 -> R.drawable.hulk
            7 -> R.drawable.ironman
            8 -> R.drawable.spiderman
            9 -> R.drawable.starlord
            else -> R.drawable.thor
        }

        val stringResource = when(randomInt){
            1 -> R.string.antman
            2 -> R.string.blackpanther
            3 -> R.string.blackwidow
            4 -> R.string.captainamerica
            5 -> R.string.drstrange
            6 -> R.string.hulk
            7 -> R.string.ironman
            8 -> R.string.spiderman
            9 -> R.string.starlord
            else -> R.string.thor
        }

        image.setImageResource(drawableResource)
        textView.setText(stringResource)

    }

    private fun retryOption(){
        val main = R.drawable.marvel_logo
        image.setImageResource(main)

        textView.setText("FIND OUT THE INNER HERO IN YOU")
    }

}
