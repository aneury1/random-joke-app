package com.aneury1.random_joke.Data.Model.Providers

import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.Data.network.JokeAPIDataConsumer

class NetworkJokeProvider : JokeProvider() {

    val api = JokeAPIDataConsumer()

    override suspend fun getRandomJoke(): Joke {
        return api.getAnyJoke()
    }
}