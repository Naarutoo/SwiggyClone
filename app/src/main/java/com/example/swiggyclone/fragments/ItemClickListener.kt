package com.example.swiggyclone.fragments

import Model.RestaurantsDTO

interface ItemClickListener {
    fun onImageClicked(restaurantsDTO: RestaurantsDTO, position:Int)
}