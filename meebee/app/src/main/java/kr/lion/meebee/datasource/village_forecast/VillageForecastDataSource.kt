package kr.lion.meebee.datasource.village_forecast

import kr.lion.meebee.dto.response.VillageForecastResponse

interface VillageForecastDataSource {
    suspend fun getVillageForecast(request: Map<String, String>): VillageForecastResponse
    suspend fun setVillageForecast()
}