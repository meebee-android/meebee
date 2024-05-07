package kr.lion.meebee.usecase

import kr.lion.meebee.dto.response.VillageForecastResponse
import kr.lion.meebee.repository.village_forecast.VillageForecastRepository
import kr.lion.meebee.usecase.base.BaseUseCase
import kr.lion.meebee.usecase.base.Result

class GetVillageForecastUseCase(
    private val villageForecastRepository: VillageForecastRepository
): BaseUseCase() {

    suspend operator fun invoke(request: Map<String, String>): Result<VillageForecastResponse> = execute {
        villageForecastRepository.getVillageForecast(request)
    }
}