package AdaptersAndViewHolders

import Model.FoodsDTO
import Model.ResponseDTO
import Model.RestaurantsDTO
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swiggyclone.R

class MenuItemsAdapter(private val restaurantsDTO: List<RestaurantsDTO>?): RecyclerView.Adapter<MenuItemsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.menu_item_layout,parent, false)
        return MenuItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemsViewHolder, position: Int) {
        val foodsDTO: FoodsDTO = restaurantsDTO!!.get(position).menu?.foods?.get(position)!!
        holder.setData(foodsDTO)
    }

    override fun getItemCount(): Int {
        return restaurantsDTO!!.size
    }
}