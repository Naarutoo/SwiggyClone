package AdaptersAndViewHolders

import Model.RestaurantsDTO
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.swiggyclone.fragments.ItemClickListener
import kotlinx.android.synthetic.main.top_picks_itemview.view.*

class TopPicksViewHolder(itemView : View, private var itemClickListener: ItemClickListener) : RecyclerView.ViewHolder(itemView) {
    fun setData(restaurantsDTO: RestaurantsDTO) {
        itemView.apply {
            tvTopPickName.text = restaurantsDTO.name
            Log.e("TAG",restaurantsDTO.photograph.toString())

            Glide.with(ivTopPickImage).load(restaurantsDTO.photograph).into(ivTopPickImage)
            imageCardView.setOnClickListener{
                itemClickListener.onImageClicked(restaurantsDTO,adapterPosition)
            }

        }
    }
}