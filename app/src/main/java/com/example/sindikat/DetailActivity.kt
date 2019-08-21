package com.example.sindikat

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    // Deklarasi
    lateinit var ivGambarBerita: ImageView
    lateinit var tvTglTerbit: TextView
    lateinit var tvPenulis: TextView
    lateinit var wvKontenBerita: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Anda menyukai berita ini ...", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        // Inisialisasi
        ivGambarBerita = findViewById<View>(R.id.ivGambarBerita) as ImageView
        tvTglTerbit = findViewById<View>(R.id.tvTglTerbit) as TextView
        tvPenulis = findViewById<View>(R.id.tvPenulis) as TextView
        wvKontenBerita = findViewById<View>(R.id.wvKontenBerita) as WebView

        // Jalankan method tampil detail berita
        showDetailBerita()

    }

    private fun showDetailBerita() {
        // Tangkap data dari intent
        val judul_berita = intent.getStringExtra("JDL_BERITA")
        val tanggal_berita = intent.getStringExtra("TGL_BERITA")
        val penulis_berita = intent.getStringExtra("PNS_BERITA")
        val isi_berita = intent.getStringExtra("ISI_BERITA")
        val foto_berita = intent.getStringExtra("FTO_BERITA")

        // Set judul actionbar / toolbar
        supportActionBar!!.title = judul_berita

        // Set ke widget
        tvPenulis.text = "Oleh : $penulis_berita"
        tvTglTerbit.text = tanggal_berita
        // Untuk gambar berita
        Picasso.with(this).load(foto_berita).into(ivGambarBerita)
        // Set isi berita sebagai html ke WebView
        wvKontenBerita.settings.javaScriptEnabled = true
        wvKontenBerita.loadData(isi_berita, "text/html; charset=utf-8", "UTF-8")
    }
}