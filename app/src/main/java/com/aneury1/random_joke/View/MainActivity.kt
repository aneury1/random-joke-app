package com.aneury1.random_joke.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.aneury1.random_joke.R
import com.aneury1.random_joke.ViewModel.JokeViewModel
import com.aneury1.random_joke.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val jokeViewModel: JokeViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextJoke.setOnClickListener{
            jokeViewModel.updateJoke()
        }

        jokeViewModel.joke.observe(this, Observer {
              Toast.makeText(applicationContext, "Test Update", Toast.LENGTH_LONG).show()
        });
    }
}