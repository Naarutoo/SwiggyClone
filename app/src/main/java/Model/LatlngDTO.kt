package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LatlngDTO(

	@field:SerializedName("lat")
	val lat: Any? = null,

	@field:SerializedName("lng")
	val lng: Any? = null
)