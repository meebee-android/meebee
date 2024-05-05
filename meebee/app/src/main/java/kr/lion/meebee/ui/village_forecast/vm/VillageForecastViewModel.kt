package kr.lion.meebee.ui.village_forecast.vm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kr.lion.meebee.usecase.GetVillageForecastUseCase
import kr.lion.meebee.usecase.base.Result
import kotlinx.coroutines.launch
import kr.lion.meebee.dto.request.VillageForecastRequest
import kr.lion.meebee.dto.request.toMap
import kr.lion.meebee.dto.response.VillageForecastResponse

class VillageForecastViewModel(
    private val getVillageForecastUseCase: GetVillageForecastUseCase
): ViewModel() {
    init {
        viewModelScope.launch {
            val result = handleVillageForecastResultUseCase(
                getVillageForecastUseCase(
                    VillageForecastRequest(
                        "t2ivQakqcZ/cvxzekT7Ra9Ja8J1N1lBKu6LqVkijMliEeoD1lLXU0Qei+V9AC8aMbNG+TjVkca70NqFB9akmSg==",
                        1,
                        1000,
                        "JSON",
                        "20240504",
                        "0500",
                        "55",
                        "127").toMap()))


            result?.let {
                Log.d("getTouristSpotWeatherUseCaseReuslt", it.response.toString())
            }
        }
    }

    private fun handleVillageForecastResultUseCase(result: Result<VillageForecastResponse>):
            VillageForecastResponse? {
        return when (result) {
            // UI에서 사용할 data class로 매핑 로직 추가 예정
            is Result.Success -> result.value
            // 에러일 때 로직 추가 예정
            is Result.Error -> null
        }
    }
}