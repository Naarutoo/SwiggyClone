package com.example.swiggyclone.fragments

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.popular_itemview.view.*

class PopularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setData(popularModel: PopularModel){
        itemView.apply {
            tvPopularName.text = popularModel.name
            ivPopularImage.setImageResource(popularModel.image)
        }
    }
}