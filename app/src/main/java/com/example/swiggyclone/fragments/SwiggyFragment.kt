package com.example.swiggyclone.fragments

import Model.ResponseDTO
import Model.RestaurantsDTO
import Retrofit.ApiService
import Retrofit.Network
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiggyclone.R
import kotlinx.android.synthetic.main.fragment_swiggy.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SwiggyFragment : Fragment() {
    private var list: ArrayList<PopularModel> = ArrayList()
    private var restaurantDTOList=listOf<RestaurantsDTO>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
   //     buildPopularList()
     //   setPopularRecyclerview()
         callApi()

    }

    private fun callApi() {
        val apiClient= Network.getRetrofit().create(ApiService::class.java)

        apiClient.getDetails().enqueue(object : Callback<ResponseDTO>{
            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                restaurantDTOList = response.body()?.restaurants as List<RestaurantsDTO>
                setTopPicksRestaurant()
            }

            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

    private fun setTopPicksRestaurant() {
        var linearLayoutManager = LinearLayoutManager(context)
        rvTopPicks.layoutManager = linearLayoutManager
        var topPicksAdapter = TopPicksAdapter(restaurantDTOList)
        rvTopPicks.adapter = topPicksAdapter
    }


    private fun setPopularRecyclerview() {
        var linearLayoutManager = LinearLayoutManager(context)
        rvPopular.layoutManager = linearLayoutManager
        var popularAdapter = PopularAdapter(list)
        rvPopular.adapter = popularAdapter
    }

    private fun buildPopularList() {
        TODO("Not yet implemented")
    }

    private fun buildList() {

    }

    private fun setRecyclerView() {


    }



}