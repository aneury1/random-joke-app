package com.aneury1.random_joke.Data.Model.Providers

import com.aneury1.random_joke.Data.Model.dataModel.Joke

class LocalJokeProvider : JokeProvider() {
    override suspend fun getRandomJoke(): Joke {
        return Joke.getFakeJoke()!!
    }
}