package AdaptersAndViewHolders

import Model.FoodsDTO
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.menu_item_layout.view.*

class MenuItemsViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    fun setData(foodsDTO: FoodsDTO){
        itemView.apply {
            tvDishName.text=foodsDTO.name
            tvDishPrice.text=foodsDTO.price.toString()
            Glide.with(ivDishImage).load(foodsDTO.image).into(ivDishImage)

        }
    }
}
