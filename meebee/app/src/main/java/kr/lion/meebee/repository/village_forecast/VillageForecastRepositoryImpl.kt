package kr.lion.meebee.repository.village_forecast

import kr.lion.meebee.datasource.village_forecast.VillageForecastDataSource
import kr.lion.meebee.dto.response.VillageForecastResponse

class VillageForecastRepositoryImpl(
    private val remote: VillageForecastDataSource,
    private val local: VillageForecastDataSource
): VillageForecastRepository {

    override suspend fun getVillageForecast(request: Map<String, String>): VillageForecastResponse {
        return remote.getVillageForecast(request)
    }
}
