package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailMenu : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_RATING = "extra_rating"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Menu Makanan"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail : TextView = findViewById(R.id.tv_item_detail)
        var imgphoto : ImageView = findViewById(R.id.img_menu)
        val tvHarga : TextView = findViewById(R.id.harga_values)
        val tvRating : TextView = findViewById(R.id.rating_values)
        val btnFavorite : Button = findViewById(R.id.btn_set_favorite)
        val btnBeli : Button = findViewById(R.id.btn_set_beli)


        val tName = intent.getStringExtra(EXTRA_NAME)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tHarga = intent.getStringExtra(EXTRA_HARGA)
        val tRating = intent.getStringExtra(EXTRA_RATING)


        tvName.text = tName
        tvDetail.text = tDetail
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgphoto)

        tvHarga.text = tHarga
        tvRating.text = tRating


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}