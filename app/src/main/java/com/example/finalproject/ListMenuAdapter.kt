package com.example.finalproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.coroutines.NonDisposableHandle.parent

class ListMenuAdapter(private val listMenu : ArrayList<Daftar>) : RecyclerView.Adapter<ListMenuAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_row_menu, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val menu = listMenu[position]

        Glide.with(holder.itemView.context)
            .load(menu.photo)
            .apply(RequestOptions())
            .into(holder.imgphoto)

        holder.tvName.text = menu.name
        holder.tvDetail.text = menu.detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val pressDetail = Intent(mContext, DetailMenu::class.java)
            pressDetail.putExtra(DetailMenu.EXTRA_NAME, menu.name)
            pressDetail.putExtra(DetailMenu.EXTRA_DETAIL, menu.detail)
            pressDetail.putExtra(DetailMenu.EXTRA_PHOTO, menu.photo)
            pressDetail.putExtra(DetailMenu.EXTRA_HARGA, menu.detail_harga)
            pressDetail.putExtra(DetailMenu.EXTRA_RATING, menu.detail_rating)
            mContext.startActivity(pressDetail)

        }

    }

    override fun getItemCount(): Int {
        return listMenu.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgphoto : ImageView = itemView.findViewById(R.id.img_menu)


    }
}