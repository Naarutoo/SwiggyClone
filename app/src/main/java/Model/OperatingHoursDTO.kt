package Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class OperatingHoursDTO(

	@field:SerializedName("Monday")
	val monday: String? = null,

	@field:SerializedName("Tuesday")
	val tuesday: String? = null,

	@field:SerializedName("Wednesday")
	val wednesday: String? = null,

	@field:SerializedName("Thursday")
	val thursday: String? = null,

	@field:SerializedName("Friday")
	val friday: String? = null,

	@field:SerializedName("Saturday")
	val saturday: String? = null,

	@field:SerializedName("Sunday")
	val sunday: String? = null
)