package activities

import AdaptersAndViewHolders.AdapterMenu
import AdaptersAndViewHolders.MenuItemsAdapter
import AdaptersAndViewHolders.PopularAdapter
import Model.FoodsDTO
import Model.MenuModel
import Model.ResponseDTO
import Model.RestaurantsDTO
import Retrofit.ApiService
import Retrofit.Network
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.view.menu.MenuAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiggyclone.R
import kotlinx.android.synthetic.main.activity_restaurant_details.*
import kotlinx.android.synthetic.main.fragment_swiggy.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestaurantDetailsActivity : AppCompatActivity() {

    private var menuList: ArrayList<MenuModel> = ArrayList<MenuModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_details)
        buildMenuList()
        buildMenuRecyclerView()
        //callApi()
    }

    private fun buildMenuRecyclerView() {
        var linearLayoutManager = LinearLayoutManager(this)
        rvRecommended.layoutManager = linearLayoutManager
        var adapterMenu = AdapterMenu(menuList)
        rvRecommended.adapter = adapterMenu
    }

    private fun buildMenuList() {
        menuList.add(MenuModel("Pizza",99,R.drawable.full_pizza))
        menuList.add(MenuModel("Butter Naan",80,R.drawable.butter_naan))
        menuList.add(MenuModel("Burger",60,R.drawable.burger))
        menuList.add(MenuModel("Chicken Do Pyaza",350,R.drawable.chicken_do_pyaza))
        menuList.add(MenuModel("South Indian Thaal",299,R.drawable.south_indian_thal))
        menuList.add(MenuModel("Fish",149,R.drawable.fish))
        menuList.add(MenuModel("India Thaal",999,R.drawable.india_thaal))
        menuList.add(MenuModel("Rajma Chaval",149,R.drawable.rajma))
        menuList.add(MenuModel("Biryani",199,R.drawable.birayani))
        menuList.add(MenuModel("Salad",99,R.drawable.salad))
        menuList.add(MenuModel("Momos",99,R.drawable.momos))

    }

   /* private fun callApi() {
        val apiClient = Network.getRetrofit().create(ApiService::class.java)
        apiClient.getDetails().enqueue(object : Callback<ResponseDTO> {
            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                restaurantsDTO = response.body()!!.restaurants
                setRecyclerView()
            }

            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }

    private fun setRecyclerView() {

    }
    */
}