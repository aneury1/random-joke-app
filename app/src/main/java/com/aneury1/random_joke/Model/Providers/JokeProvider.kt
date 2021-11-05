package com.aneury1.random_joke.Model.Providers

import com.aneury1.random_joke.Model.dataModel.Joke

abstract class JokeProvider {

   abstract fun getRandomJoke(): Joke

}