package com.example.sindikat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.sindikat.network.InitRetrofit
import com.example.sindikat.response.ResponseBerita
import kotlinx.android.synthetic.main.activity_bisnis.*
import kotlinx.android.synthetic.main.activity_entertainment.*
import kotlinx.android.synthetic.main.activity_tampil_berita_semua.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class BisnisActivity : AppCompatActivity() {

    // Deklarasi Widget
    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bisnis)

        // Inisialisasi Widget
        recyclerView = findViewById<View>(R.id.rvListBeritaBisnis) as RecyclerView?
        // RecyclerView harus pakai Layout manager
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        // Eksekusi method

        tampilBeritaBisnis()

    }
    private fun tampilBeritaBisnis() {
        val api = InitRetrofit.instance
        // Siapkan request
        val beritaCall = api.beritabisnis()
        // Kirim request
        beritaCall.enqueue(object : Callback<ResponseBerita> {
            override fun onResponse(call: Call<ResponseBerita>, response: Response<ResponseBerita>) {
                // Pasikan response Sukses
                if (response.isSuccessful) {
                    Log.d("response api", response.body()!!.toString())
                    // tampung data response body ke variable
                    val data_berita = response.body()!!.berita
                    val status = response.body()!!.isStatus
                    // Kalau response status nya = true
                    if (status) {
                        // Buat Adapter untuk recycler view
                        val adapter = AdapterBerita(this@BisnisActivity, data_berita!!)
                        recyclerView!!.adapter = adapter
                    } else {
                        // kalau tidak true
                        Toast.makeText(this@BisnisActivity, "Tidak ada berita untuk saat ini", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            override fun onFailure(call: Call<ResponseBerita>, t: Throwable) {
                // print ke log jika Error
                t.printStackTrace()
            }
        })
    }

}
