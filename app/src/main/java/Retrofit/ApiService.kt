package Retrofit

import Model.ResponseDTO
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("douglesoo7/b86b3964b350f31a7ea784c230ac7c6a/raw/bbe84e12e36f0272f3b6bbbde1ce585e72559192/swiggy_db")
    fun getDetails():Call<ResponseDTO>
}