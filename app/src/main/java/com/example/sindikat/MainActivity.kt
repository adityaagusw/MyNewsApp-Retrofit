package com.example.sindikat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewflipper : ViewFlipper
    private var image = intArrayOf(R.drawable.bisnis,
                                                                R.drawable.otomotif,
                                                                R.drawable.sport,
                                                                R.drawable.entertainment,
                                                                R.drawable.food,
                                                                R.drawable.politik,
                                                                R.drawable.travel)
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewflipper = findViewById(R.id.gmbAllKategori)
        toolbar = findViewById(R.id.toolBarMenuAwal)
        setSupportActionBar(toolbar)

        getSupportActionBar()!!.setTitle("SindikaT")
        toolbar.setSubtitle("Seputar Informasi di Kawasan Tangerang")


        for(i in 0 until image.size) {
            flip_image(image[i])
        }

            btnSemuaBerita.setOnClickListener {
            startActivity(Intent(this,TampilBeritaSemuaActivity::class.java))
            Toast.makeText(this,"Selamat datang di Tampilan Semua Berita",Toast.LENGTH_SHORT).show()
        }

        cvOlahraga.setOnClickListener {
            startActivity(Intent(this,OlahragaActivity::class.java))
            Toast.makeText(this,"Selamat datang di berita Olahraga",Toast.LENGTH_SHORT).show()
        }

        cvEntertainment.setOnClickListener {
            startActivity(Intent(this,EntertainmentActivity::class.java))
            Toast.makeText(this,"Selamat datang di berita Entertainment",Toast.LENGTH_SHORT).show()
        }

        cvBisnis.setOnClickListener {
            startActivity(Intent(this,BisnisActivity::class.java))
            Toast.makeText(this,"Selamat datang di berita Bisnis",Toast.LENGTH_SHORT).show()
        }

        cvPolitik.setOnClickListener {
            startActivity(Intent(this,PolitikActivity::class.java))
            Toast.makeText(this,"Selamat datang di berita Politik",Toast.LENGTH_SHORT).show()
        }

        cvOtomotif.setOnClickListener {
            startActivity(Intent(this,OtomotifActivity::class.java))
            Toast.makeText(this,"Selamat datang di berita Otomotif",Toast.LENGTH_SHORT).show()
        }

        cvFoodandTravel.setOnClickListener {
            startActivity(Intent(this,TravelFoodActivity::class.java))
            Toast.makeText(this,"Selamat datang di berita Food dan Travel",Toast.LENGTH_SHORT).show()
        }
    }

    fun flip_image(i : Int) {
        val view = ImageView(this)
        view.setBackgroundResource(i)
        viewflipper.addView(view)
        viewflipper.setFlipInterval(3000)
        viewflipper.setAutoStart(true)
        viewflipper.setInAnimation(this , android.R.anim.slide_in_left)
        viewflipper.setOutAnimation(this , android.R.anim.slide_out_right)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val pindahLayout = menuInflater
        pindahLayout.inflate(R.menu.menu_about_us, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item?.itemId == R.id.aboutUsMe){
            startActivity(Intent(this,AboutUs::class.java))
        }
        return true
    }

}
