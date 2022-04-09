package com.example.androiddev.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientUsers {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val instance : ApiUsers by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(ApiUsers::class.java)
    }
}