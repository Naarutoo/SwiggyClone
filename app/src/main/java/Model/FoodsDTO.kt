package Model

import java.io.Serializable

data class FoodsDTO(
	val addon: List<AddonDTO?>? = null,
	val description: String? = null,
	val id: String? = null,
	val image: String? = null,
	val name: String? = null,
	val price: Any? = null,
	val size: List<SizeDTO?>? = null
)