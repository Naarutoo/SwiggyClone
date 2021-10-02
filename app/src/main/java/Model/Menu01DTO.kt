package Model

import java.io.Serializable

data class Menu01DTO(
	val foods: List<FoodsDTO?>? = null,
	val image: String? = null,
	val name: String? = null
)