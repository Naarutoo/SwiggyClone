package Retrofit

import Model.ResponseDTO
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/douglesoo7/b86b3964b350f31a7ea784c230ac7c6a/raw/1fa2008bc7fd2ed5a1fe2e1e1be6c00d4dc70911/swiggy_db")
    fun getDetails():Call<ResponseDTO>
}