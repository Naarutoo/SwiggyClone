package Model

import java.io.Serializable

data class OperatingHoursDTO(
	val monday: String? = null,
	val tuesday: String? = null,
	val wednesday: String? = null,
	val thursday: String? = null,
	val friday: String? = null,
	val saturday: String? = null,
	val sunday: String? = null
)