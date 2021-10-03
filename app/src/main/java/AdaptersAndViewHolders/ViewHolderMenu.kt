package AdaptersAndViewHolders

import Model.MenuModel
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu_item_layout.view.*

class ViewHolderMenu(itemView: View) :RecyclerView.ViewHolder(itemView) {
    fun setData(menuModel: MenuModel){
        itemView.apply {
            tvDishName.text=menuModel.name
            tvDishPrice.text=menuModel.price.toString()
            ivDishImage.setImageResource(menuModel.image)
        }
    }
}