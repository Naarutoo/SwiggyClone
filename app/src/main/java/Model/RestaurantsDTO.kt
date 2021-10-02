package Model

import java.io.Serializable

data class RestaurantsDTO(
	val id: Int? = null,
	val menu01: Menu01DTO? = null,
	val name: String? = null,
	val neighborhood: String? = null,
	val photograph: String? = null,
	val address: String? = null,
	val latlng: LatlngDTO? = null,
	val cuisineType: String? = null,
	val operatingHours: OperatingHoursDTO? = null,
	val reviews: List<ReviewsDTO?>? = null
)