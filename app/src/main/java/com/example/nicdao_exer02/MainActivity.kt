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
            1 -> textView.setText(R.string.antman)
            2 -> textView.setText(R.string.blackpanther)
            3 -> textView.setText(R.string.blackwidow)
            4 -> textView.setText(R.string.captainamerica)
            5 -> textView.setText(R.string.drstrange)
            6 -> textView.setText(R.string.hulk)
            7 -> textView.setText(R.string.ironman)
            8 -> textView.setText(R.string.spiderman)
            9 -> textView.setText(R.string.starlord)
            else -> textView.setText(R.string.thor)
        }

        image.setImageResource(drawableResource)


    }

    private fun retryOption(){
        val main = R.drawable.marvel_logo
        image.setImageResource(main)
    }

}
