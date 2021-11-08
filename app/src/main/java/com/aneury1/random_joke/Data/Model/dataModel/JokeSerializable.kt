package com.aneury1.random_joke.Data.Model.dataModel

import java.io.Serializable


class JokeSerializable : Serializable {

    private lateinit var  _joke:Joke

    constructor(joke: Joke)

    fun getJoke() :Joke = this._joke

}