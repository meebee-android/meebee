package kr.lion.meebee.network.service

import kr.lion.meebee.dto.response.VillageForecastResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface VillageForecastService {
    @GET("getVilageFcst")
    fun getVillageForecast(@QueryMap params: Map<String, String>)
    : Call<VillageForecastResponse>
}