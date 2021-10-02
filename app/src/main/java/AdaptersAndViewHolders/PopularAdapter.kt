package AdaptersAndViewHolders

import AdaptersAndViewHolders.PopularViewHolder
import Model.PopularModel
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.swiggyclone.R

class PopularAdapter(private val list: ArrayList<PopularModel>) :
    RecyclerView.Adapter<PopularViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.popular_itemview, parent, false)
        return PopularViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val popularModel = list.get(position)
        holder.setData(popularModel)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}