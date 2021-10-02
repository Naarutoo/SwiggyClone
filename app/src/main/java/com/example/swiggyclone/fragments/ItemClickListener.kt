package com.example.swiggyclone.fragments
import Model.RestaurantsDTO
import java.text.FieldPosition

interface ItemClickListener {
    fun onImageClicked(restaurantsDTO: RestaurantsDTO,position:Int)
}