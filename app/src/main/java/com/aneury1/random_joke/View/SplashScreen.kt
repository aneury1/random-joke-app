package com.aneury1.random_joke.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ///@TODO("todo Decide what todo before load the main Activity. maybe create an cache for Some Joke")

        Thread.sleep(13000)
        startActivity(Intent(applicationContext, MainActivity::class.java))
    }
}