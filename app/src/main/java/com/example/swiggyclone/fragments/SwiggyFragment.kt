package com.example.swiggyclone.fragments

import AdaptersAndViewHolders.PopularAdapter
import AdaptersAndViewHolders.TopPicksAdapter
import Model.PopularModel
import Model.ResponseDTO
import Model.RestaurantsDTO
import Retrofit.ApiService
import Retrofit.Network
import activities.RestaurantDetailsActivity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiggyclone.R
import kotlinx.android.synthetic.main.fragment_swiggy.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SwiggyFragment : Fragment() ,ItemClickListener {
    private var list: ArrayList<PopularModel> = ArrayList()
    private var restaurantDTOList=listOf<RestaurantsDTO>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buildPopularList()
        setPopularRecyclerview()
        callApi()

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_swiggy, container, false)
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
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rvTopPicks.layoutManager = linearLayoutManager
        var topPicksAdapter = TopPicksAdapter(restaurantDTOList, this)
        rvTopPicks.adapter = topPicksAdapter
    }


    private fun setPopularRecyclerview() {
        var linearLayoutManager2 = LinearLayoutManager(context)
        linearLayoutManager2.orientation = LinearLayoutManager.HORIZONTAL
        rvPopular.layoutManager = linearLayoutManager2
        var popularAdapter = PopularAdapter(list)
        rvPopular.adapter = popularAdapter
    }

    private fun buildPopularList() {
        list.add(PopularModel(R.drawable.kfc,"KFC"))
        list.add(PopularModel(R.drawable.subway,"Subway"))
        list.add(PopularModel(R.drawable.pizzahut,"Pizza Hut"))
        //list.add(PopularModel(R.drawable.burger_king,"Burger King"))
        //list.add(PopularModel(R.drawable.starbucks,"Starbucks"))
        list.add(PopularModel(R.drawable.dominoz,"Dominoz"))
        // list.add(PopularModel(R.drawable.rohit,"Rohit wadewale"))

    }

    override fun onImageClicked(restaurantsDTO: RestaurantsDTO, position: Int) {
        Toast.makeText(context,"dfskfjslkjfkfjdksf",Toast.LENGTH_SHORT).show()
        val intent = Intent(requireContext(), RestaurantDetailsActivity::class.java)
        startActivity(intent)
    }
}