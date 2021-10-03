package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RestaurantsDTO(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("menu")
	val menu: MenuDTO? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("neighborhood")
	val neighborhood: String? = null,

	@field:SerializedName("photograph")
	val photograph: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("latlng")
	val latlng: LatlngDTO? = null,

	@field:SerializedName("cuisine_type")
	val cuisineType: String? = null,

	@field:SerializedName("operating_hours")
	val operatingHours: OperatingHoursDTO? = null,

	@field:SerializedName("reviews")
	val reviews: List<ReviewsDTO?>? = null
)