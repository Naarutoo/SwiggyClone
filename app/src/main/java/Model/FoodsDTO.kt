package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class FoodsDTO(

	@field:SerializedName("addon")
	val addon: List<AddonDTO?>? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("price")
	val price: Any? = null,

	@field:SerializedName("size")
	val size: List<SizeDTO?>? = null
)