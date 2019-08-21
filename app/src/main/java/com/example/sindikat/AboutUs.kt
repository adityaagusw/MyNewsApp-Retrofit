package com.example.sindikat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutUs : AppCompatActivity() {

    lateinit var textSindikatAboutUs : TextView
    lateinit var textAdi : TextView
    lateinit var textAditya : TextView
    lateinit var textAkmal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        textSindikatAboutUs = findViewById(R.id.textSindikatAboutUs)
        textAdi = findViewById(R.id.textAdi)
        textAditya = findViewById(R.id.textAditya)
        textAkmal = findViewById(R.id.textAkmal)

        textSindikatAboutUs.text = "SINDIKAT, merupakan portal berita yang berfokus pada pembaca berkedudukan di Kota Tangerang, Kabupaten Tangerang, Tangerang Selatan, serta pembaca yang berada di tanah air" +
                " Portal berita ini dibuat untuk memenuhi tugas PEMROGRAMAN 2 (PR202A), Web ini dibuat dan dikembangkan oleh KELOMPOK 4"

        textAdi.text = "Perkenalkan nama saya Adi Hidayat dengan Nim 1822499469, saya kuliah di Universitas Raharja dan saya ahli di bidang Web Developer"

        textAditya.text = "Perkenalkan nama saya Aditya Agus Wisanto dengan Nim 1722498511, saya kuliah di Universitas Raharja dan keahlian saya di bidang Android Developer"

        textAkmal.text = "Perkenalkan nama saya Akmal Ardhi Pangestu dengan Nim 1722496678, saya kuliah di Universitas Raharja dan keahlian saya di bidang Design"

    }
}
