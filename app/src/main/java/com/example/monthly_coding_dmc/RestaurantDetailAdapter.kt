package com.example.monthly_coding_dmc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RestaurantDetailAdapter(var list: MutableList<Int>) : RecyclerView.Adapter<RestaurantDetailAdapter.BannerViewHolder>() {

    inner class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView_banner = itemView.findViewById<ImageView>(R.id.imageView_idol)

        fun onBind(res: Int) {
            imageView_banner.setImageResource(res)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant_detail, parent, false)
        return BannerViewHolder(view)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}