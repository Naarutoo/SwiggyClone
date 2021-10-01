package Retrofit

import Model.ResponseDTO
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    //https://gist.githubusercontent.com/douglesoo7/b86b3964b350f31a7ea784c230ac7c6a/raw/67386c6f4cd5473fd9390f0ccfa4c66cfb2cc537/swiggy_db
    @GET("douglesoo7/b86b3964b350f31a7ea784c230ac7c6a/raw/67386c6f4cd5473fd9390f0ccfa4c66cfb2cc537/swiggy_db")
    fun getDetails():Call<ResponseDTO>
}