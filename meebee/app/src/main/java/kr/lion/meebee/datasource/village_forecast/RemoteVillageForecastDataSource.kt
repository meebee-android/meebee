package kr.lion.meebee.datasource.village_forecast

import kr.lion.meebee.dto.response.VillageForecastResponse
import kr.lion.meebee.network.service.VillageForecastService
import retrofit2.await

class RemoteVillageForecastDataSource(
    private val villageForecastService: VillageForecastService
): VillageForecastDataSource {

    override suspend fun getVillageForecast(request: Map<String, String>): VillageForecastResponse {
        return villageForecastService
            .getVillageForecast(request)
            .await()
    }

    override suspend fun setVillageForecast() {}
}