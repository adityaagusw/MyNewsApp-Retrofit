package com.example.sindikat.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object InitRetrofit {

    // URL Server API
    var API_URL = "http://10.0.2.2/portal_berita/"

    val instance: ApiServices
        get() = setInit().create(ApiServices::class.java)

    fun setInit(): Retrofit {
        return Retrofit.Builder().baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}