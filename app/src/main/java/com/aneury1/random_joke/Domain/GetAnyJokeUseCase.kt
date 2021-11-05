package com.aneury1.random_joke.Domain

import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.Data.network.JokeAPIDataConsumer

class GetAnyJokeUseCase {

    private val repository = JokeAPIDataConsumer()

    suspend operator fun invoke() :Joke = repository.getAnyJoke()

}