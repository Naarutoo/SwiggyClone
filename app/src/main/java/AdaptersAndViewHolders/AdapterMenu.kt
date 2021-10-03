package AdaptersAndViewHolders

import Model.MenuModel
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swiggyclone.R

class AdapterMenu(private val list: ArrayList<MenuModel>) : RecyclerView.Adapter<ViewHolderMenu>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMenu {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item_layout, parent, false)
        return ViewHolderMenu(view)
    }

    override fun onBindViewHolder(holder: ViewHolderMenu, position: Int) {
        val menuModel=list.get(position)
        holder.setData(menuModel)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}