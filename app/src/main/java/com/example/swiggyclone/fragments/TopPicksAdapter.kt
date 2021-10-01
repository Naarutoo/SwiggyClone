package com.example.swiggyclone.fragments

import Model.ResponseDTO
import Model.RestaurantsDTO
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swiggyclone.R


class TopPicksAdapter(private val responseList: List<RestaurantsDTO>) : RecyclerView.Adapter<TopPicksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopPicksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.top_picks_itemview,parent,false);
        return TopPicksViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopPicksViewHolder, position: Int) {
        val restaurantsDTO = responseList[position]
        holder.setData(restaurantsDTO)
    }

    override fun getItemCount(): Int {
        return responseList.size
    }
}