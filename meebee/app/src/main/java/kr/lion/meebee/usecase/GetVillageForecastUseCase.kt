package co.kr.lion.meebee.usecase

import kr.lion.meebee.dto.response.VillageForecastResponse
import kr.lion.meebee.repository.village_forecast.VillageForecastRepositoryImpl
import co.kr.lion.meebee.usecase.base.BaseUseCase
import co.kr.lion.meebee.usecase.base.Result

class GetVillageForecastUseCase(
    private val villageForecastRepository: VillageForecastRepositoryImpl
): BaseUseCase() {

    suspend operator fun invoke(request: Map<String, String>): Result<VillageForecastResponse> = execute {
        villageForecastRepository.getVillageForecast(request)
    }
}