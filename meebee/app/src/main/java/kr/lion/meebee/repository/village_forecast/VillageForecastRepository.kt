package kr.lion.meebee.repository.village_forecast

import kr.lion.meebee.Constant.VILLAGE_FORECAST_BASE_URL
import kr.lion.meebee.datasource.village_forecast.LocalVillageForecastDataSource
import kr.lion.meebee.datasource.village_forecast.RemoteVillageForecastDataSource
import kr.lion.meebee.dto.response.VillageForecastResponse
import kr.lion.meebee.network.RetrofitInstance
import kr.lion.meebee.network.service.VillageForecastService

interface VillageForecastRepository {
    suspend fun getVillageForecast(request: Map<String, String>): VillageForecastResponse

    companion object {
        fun create(): VillageForecastRepository {
            return VillageForecastRepositoryImpl(
                RemoteVillageForecastDataSource(
                    RetrofitInstance.provideService(
                        VILLAGE_FORECAST_BASE_URL,
                        VillageForecastService::class.java,
                    )
                ),
                LocalVillageForecastDataSource(),
            )
        }
    }
}