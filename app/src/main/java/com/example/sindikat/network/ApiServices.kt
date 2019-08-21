package com.example.sindikat.network

import com.example.sindikat.response.ResponseBerita
import retrofit2.Call
import retrofit2.http.GET

interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("semuaberita.php")
    fun beritasemua(): Call<ResponseBerita>
    // <ModelData> nama_method()

    //@TIPEMETHOD("API_END_POINT")
    @GET("entertainment.php")
    fun beritaentertaintment(): Call<ResponseBerita>
    // <ModelData> nama_method()

    //@TIPEMETHOD("API_END_POINT")
    @GET("bisnis.php")
    fun beritabisnis(): Call<ResponseBerita>
    // <ModelData> nama_method()

    //@TIPEMETHOD("API_END_POINT")
    @GET("sports.php")
    fun beritasports(): Call<ResponseBerita>
    // <ModelData> nama_method()

    //@TIPEMETHOD("API_END_POINT")
    @GET("otomotif.php")
    fun beritaotomotif(): Call<ResponseBerita>
    // <ModelData> nama_method()

    //@TIPEMETHOD("API_END_POINT")
    @GET("foodtravel.php")
    fun beritafoodtravel(): Call<ResponseBerita>
    // <ModelData> nama_method()

    //@TIPEMETHOD("API_END_POINT")
    @GET("politik.php")
    fun beritapolitik(): Call<ResponseBerita>
    // <ModelData> nama_method()

}