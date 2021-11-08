package com.aneury1.random_joke.UserInterface.View

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.Data.Model.dataModel.JokeSerializable
import com.aneury1.random_joke.R
import com.aneury1.random_joke.UserInterface.ViewModel.JokeViewModel
import com.aneury1.random_joke.Utils.Constant
import com.aneury1.random_joke.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val singleJoke   = SingleJoke()
    private val twoPartJoke  = TwoPartJoke()
    private val jokeViewModel: JokeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        jokeViewModel.onCreate()
        jokeViewModel.updateJoke()

        binding.btnNextJoke.setOnClickListener {
            jokeViewModel.updateJoke()
        }

        jokeViewModel.joke.observe(this, Observer {
            if (it.type == "simple") {
                Toast.makeText(applicationContext,"Simple", Toast.LENGTH_LONG).show()
                setSingleFragment(it)
            } else {
                Toast.makeText(applicationContext,"Simple not", Toast.LENGTH_LONG).show()

                setTwoPartFragment(it)
            }
        });
    }

    private fun setSingleFragment(joke: Joke) {
        replaceFragment(singleJoke, joke)
    }

    private fun setTwoPartFragment(joke: Joke) {
        replaceFragment(twoPartJoke, joke)
    }

    private fun replaceFragment(fragment: Fragment, joke: Joke) {


        val bundle = Bundle()
        bundle.putString(Constant.JOKE_SETUP, joke.setup)
        bundle.putString(Constant.JOKE_DELIVERY, joke.delivery)
        bundle.putString(Constant.JOKE_TYPE, joke.type)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.joke_fragment, fragment)
            commit()
        }
    }

}