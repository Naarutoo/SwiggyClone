package com.example.swiggyclone.fragments

import Model.RestaurantsDTO
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.top_picks_itemview.view.*

class TopPicksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(restaurantsDTO: RestaurantsDTO) {
        itemView.apply {
            tvTopPickName.text = restaurantsDTO.name
            Glide.with(ivTopPickImage).load(restaurantsDTO.photograph).into(ivTopPickImage)
        }
    }
}