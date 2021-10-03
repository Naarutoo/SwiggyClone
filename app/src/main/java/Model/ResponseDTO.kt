package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseDTO(

	@field:SerializedName("restaurants")
	val restaurants: List<RestaurantsDTO?>? = null
)