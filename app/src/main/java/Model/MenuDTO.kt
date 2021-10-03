package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MenuDTO(

	@field:SerializedName("foods")
	val foods: List<FoodsDTO?>? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)