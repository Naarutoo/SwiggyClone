package com.example.swiggyclone.fragments

import Model.RestaurantsDTO
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.swiggyclone.R
import kotlinx.android.synthetic.main.top_picks_itemview.view.*

class TopPicksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(restaurantsDTO: RestaurantsDTO) {
        itemView.apply {
            tvTopPickName.text = restaurantsDTO.name
            Log.e("TAG",restaurantsDTO.photograph.toString())

            Glide.with(ivTopPickImage).load(restaurantsDTO.photograph).into(ivTopPickImage)
        }
    }
}