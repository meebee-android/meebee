package kr.lion.meebee.datasource.village_forecast

import kr.lion.meebee.dto.response.VillageForecastResponse

class LocalVillageForecastDataSource: VillageForecastDataSource {
    override suspend fun getVillageForecast(request: Map<String, String>): VillageForecastResponse {
        TODO("Not yet implemented")
    }

    override suspend fun setVillageForecast() {
        TODO("Not yet implemented")
    }
}