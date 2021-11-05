package com.aneury1.random_joke.Model.Providers

import com.aneury1.random_joke.Model.dataModel.Joke

class NetworkJokeProvider : JokeProvider() {
    override fun getRandomJoke(): Joke {
        return Joke.getFakeJoke()!!
    }
}