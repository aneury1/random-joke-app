package com.aneury1.random_joke.Data.network

import android.util.Log
import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.Utils.Retrofit2
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class JokeAPIDataConsumer {

   private val retrofit2 = Retrofit2.getRetrofit2()

    suspend fun getAnyJoke(): Joke {
        return withContext(Dispatchers.IO){
            val response : Response<Joke> = retrofit2.create(JokeAPIClient::class.java).getOneJoke()
            val value=  response.body() ?: Joke.getFakeJoke()
            Log.d("HttpServer", value.toString())
            value
        }
    }

}