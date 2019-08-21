package com.example.sindikat.response

import com.google.gson.annotations.SerializedName

class BeritaItem {

    @SerializedName("penulis")
    var penulis: String? = null

    @SerializedName("view")
    var view: String? = null

    @SerializedName("id_kategori")
    var idKategori: String? = null

    @SerializedName("foto_utama")
    var fotoUtama: String? = null

    @SerializedName("jmlh_komen")
    var jmlhKomen: String? = null

    @SerializedName("tanggal")
    var tanggal: String? = null

    @SerializedName("stat_berita")
    var statBerita: String? = null

    @SerializedName("judul")
    var judul: String? = null

    @SerializedName("id_adm")
    var idAdm: String? = null

    @SerializedName("id_berita")
    var idBerita: String? = null

    @SerializedName("isi")
    var isi: String? = null

    override fun toString(): String {
        return "BeritaItem{" +
                "penulis = '" + penulis + '\''.toString() +
                ",view = '" + view + '\''.toString() +
                ",id_kategori = '" + idKategori + '\''.toString() +
                ",foto_utama = '" + fotoUtama + '\''.toString() +
                ",jmlh_komen = '" + jmlhKomen + '\''.toString() +
                ",tanggal = '" + tanggal + '\''.toString() +
                ",stat_berita = '" + statBerita + '\''.toString() +
                ",judul = '" + judul + '\''.toString() +
                ",id_adm = '" + idAdm + '\''.toString() +
                ",id_berita = '" + idBerita + '\''.toString() +
                ",isi = '" + isi + '\''.toString() +
                "}"
    }
}