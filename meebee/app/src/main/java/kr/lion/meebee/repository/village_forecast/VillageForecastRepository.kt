package kr.lion.meebee.repository.village_forecast

import kr.lion.meebee.dto.response.VillageForecastResponse

interface VillageForecastRepository {
    suspend fun getVillageForecast(request: Map<String, String>)
    : VillageForecastResponse
}