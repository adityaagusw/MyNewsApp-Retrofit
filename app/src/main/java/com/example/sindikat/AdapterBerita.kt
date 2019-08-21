package com.example.sindikat

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.sindikat.response.BeritaItem
import com.squareup.picasso.Picasso

internal class AdapterBerita(// Buat Global variable untuk manampung context
    var context: Context, var berita: List<BeritaItem>)// Inisialisasi
    : RecyclerView.Adapter<AdapterBerita.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Layout inflater
        val view = LayoutInflater.from(context).inflate(R.layout.berita_item, parent, false)

        // Hubungkan dengan MyViewHolder
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Set widget
        holder.tvJudul.text = berita[position].judul
        holder.tvTglTerbit.text = berita[position].tanggal
        holder.tvPenulis.text = berita[position].penulis

        // Dapatkan url gambar
        val urlGambarBerita = "http://10.0.2.2/portal_berita/images/" + berita[position].fotoUtama!!
        // Set image ke widget dengna menggunakan Library Piccasso
        // krena imagenya dari internet
        Picasso.with(context).load(urlGambarBerita).into(holder.ivGambarBerita)

        // Event klik ketika item list nya di klik
        holder.itemView.setOnClickListener {
            // Mulai activity Detail
            val varIntent = Intent(context, DetailActivity::class.java)
            // sisipkan data ke intent
            varIntent.putExtra("JDL_BERITA", berita[position].judul)
            varIntent.putExtra("TGL_BERITA", berita[position].tanggal)
            varIntent.putExtra("PNS_BERITA", berita[position].penulis)
            varIntent.putExtra("FTO_BERITA", urlGambarBerita)
            varIntent.putExtra("ISI_BERITA", berita[position].isi)

            // method startActivity cma bisa di pake di activity/fragment
            // jadi harus masuk ke context dulu
            context.startActivity(varIntent)
        }
    }

    // Menentukan Jumlah item yang tampil
    override fun getItemCount(): Int {
        return berita.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Deklarasi widget
        internal var ivGambarBerita: ImageView
        internal var tvJudul: TextView
        internal var tvTglTerbit: TextView
        internal var tvPenulis: TextView

        init {
            // inisialisasi widget
            ivGambarBerita = itemView.findViewById<View>(R.id.ivPosterBerita) as ImageView
            tvJudul = itemView.findViewById<View>(R.id.tvJudulBerita) as TextView
            tvTglTerbit = itemView.findViewById<View>(R.id.tvTglTerbit) as TextView
            tvPenulis = itemView.findViewById<View>(R.id.tvPenulis) as TextView
        }
    }
}