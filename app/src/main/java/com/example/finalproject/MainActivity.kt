package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDaftarMenu : RecyclerView
    private var list : ArrayList<Daftar> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar =supportActionBar
        actionBar!!.title = "Menu Makanan"


        rvDaftarMenu = findViewById(R.id.rv_daftarmenu)
        rvDaftarMenu.setHasFixedSize(true)

        list.addAll(DataMenuMakanan.listData)

        showRecyclerList()


    }

    private fun showRecyclerList(){
        rvDaftarMenu.layoutManager = LinearLayoutManager(this)
        var listMenuAdapter = ListMenuAdapter(list)
        rvDaftarMenu.adapter = listMenuAdapter
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.halaman_about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)

            }
        }
    }

}