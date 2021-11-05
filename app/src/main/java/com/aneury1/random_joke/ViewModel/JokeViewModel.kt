package com.aneury1.random_joke.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aneury1.random_joke.Model.Providers.DummyJokeProvider
import com.aneury1.random_joke.Model.Providers.JokeProvider
import com.aneury1.random_joke.Model.dataModel.Joke

class JokeViewModel : ViewModel() {

    val joke = MutableLiveData<Joke>()

    fun updateJoke(){
        val provider : JokeProvider = DummyJokeProvider()
        joke.postValue(provider.getRandomJoke())
    }

}