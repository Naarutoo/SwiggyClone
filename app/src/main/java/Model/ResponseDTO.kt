package Model

import java.io.Serializable

data class ResponseDTO(
	val restaurants: List<RestaurantsDTO?>? = null
)