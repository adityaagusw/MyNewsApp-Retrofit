package com.example.sindikat.response

import com.google.gson.annotations.SerializedName

class ResponseBerita {

    @SerializedName("berita")
    var berita: List<BeritaItem>? = null

    @SerializedName("status")
    var isStatus: Boolean = false

    override fun toString(): String {
        return "Response{" +
                "berita = '" + berita + '\''.toString() +
                ",status = '" + isStatus + '\''.toString() +
                "}"
    }
}