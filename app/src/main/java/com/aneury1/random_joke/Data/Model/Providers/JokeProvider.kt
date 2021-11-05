package com.aneury1.random_joke.Data.Model.Providers

import com.aneury1.random_joke.Data.Model.dataModel.Joke

abstract class JokeProvider {

   abstract suspend fun getRandomJoke(): Joke

}