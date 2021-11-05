package com.aneury1.random_joke.Data.network

import android.telecom.Call
import com.aneury1.random_joke.Data.Model.dataModel.Joke
import retrofit2.Response
import retrofit2.http.GET

interface JokeAPIClient {

    @GET("/joke/Any")
    suspend fun getOneJoke(): Response<Joke>

}