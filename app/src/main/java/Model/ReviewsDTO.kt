package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ReviewsDTO(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("rating")
	val rating: Int? = null,

	@field:SerializedName("comments")
	val comments: String? = null
)