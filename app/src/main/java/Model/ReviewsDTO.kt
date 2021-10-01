package Model

import java.io.Serializable

data class ReviewsDTO(
	val name: String? = null,
	val date: String? = null,
	val rating: Int? = null,
	val comments: String? = null
)