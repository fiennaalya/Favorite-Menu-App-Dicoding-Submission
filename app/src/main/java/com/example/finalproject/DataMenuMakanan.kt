package com.example.finalproject

import android.view.Menu

object DataMenuMakanan {
    private val menuMakanan= arrayOf(
        "Ayam Bakar",
        "Aneka Sayur",
        "Bakso",
        "Indomie",
        "Mie Ayam",
        "Nasi Goreng",
        "Sate Ayam",
        "Spaghetti Bolognese",
        "Steak",
        "Sushi"
    )

    private val menuDetail = arrayOf(
        "Nasi disajikan dengan ayam, tempe, tahu, lalapan, dan sambal",
        "Nasi disajikan dengan tempe orek dan sayur yang dapat dipilih " +
                "\n(bayam, asem, sop, lodeh, capcay, kangkung)",
        "Bakso satu porsi campur disajikan dengan lontong",
        "Indomie goreng atau kuah",
        "Mie ayam dengan topping yang dapat di request",
        "Nasi goreng disertai dengan telur",
        "Sate ayam disajikan dengan nasi atau lontong",
        "Spaghetti bolognese dengan saus spesial, daging dan keju",
        "Steak disajikan dengan potato dan saus pilihan",
        "Aneka macam sushi"
    )

    private val menuImages = intArrayOf(R.drawable.ayam_bakar,
        R.drawable.sayur,
        R.drawable.bakso,
        R.drawable.indomie,
        R.drawable.mie_ayam,
        R.drawable.nasi_goreng,
        R.drawable.sate_ayam,
        R.drawable.spaghetti_bolognese,
        R.drawable.steak,
        R.drawable.sushi
    )

    private val menuHarga = arrayOf(
        "Rp 15.000",
        "Rp 6.000",
        "Rp 12.000",
        "Rp 8.000",
        "Rp 10.000",
        "Rp 12.000",
        "Rp 10.000",
        "Rp 50.000",
        "Rp 105.000",
        "Rp 105.000"
    )

    private val menuRating = arrayOf(
        "4.7",
        "4.6",
        "4.8",
        "5.0",
        "4.6",
        "4.9",
        "4.7",
        "5.0",
        "4.9",
        "4.9"
    )



    val listData : ArrayList<Daftar>
        get() {
            val list = arrayListOf<Daftar>()
            for (position in menuMakanan.indices){
                val daftar = Daftar()
                daftar.name = menuMakanan[position]
                daftar.detail = menuDetail[position]
                daftar.photo = menuImages[position]
                daftar.detail_harga = menuHarga[position]
                daftar.detail_rating = menuRating[position]

                list.add(daftar)
            }
            return list
        }
}