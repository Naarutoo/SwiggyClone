package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SizeDTO(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("price")
	val price: Any? = null
)