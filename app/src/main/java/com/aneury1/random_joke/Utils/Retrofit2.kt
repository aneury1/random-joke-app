package com.aneury1.random_joke.Utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit2 {

    fun getRetrofit2(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constant.DEFAULT_PRIMARY_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}