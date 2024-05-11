package kr.lion.meebee.ui.village_forecast.vm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kr.lion.meebee.dto.request.VillageForecastRequest
import kr.lion.meebee.dto.request.toMap
import kr.lion.meebee.usecase.GetVillageForecastUseCase
import kr.lion.meebee.usecase.base.onError
import kr.lion.meebee.usecase.base.onSuccess

class VillageForecastViewModel(
    private val getVillageForecastUseCase: GetVillageForecastUseCase
) : ViewModel() {
    init {
        viewModelScope.launch {
            getVillageForecastUseCase(
                VillageForecastRequest(
                    "t2ivQakqcZ/cvxzekT7Ra9Ja8J1N1lBKu6LqVkijMliEeoD1lLXU0Qei+V9AC8aMbNG+TjVkca70NqFB9akmSg==",
                    1,
                    1000,
                    "JSON",
                    "20240504",
                    "0500",
                    "55",
                    "127"
                ).toMap()
            ).onSuccess {
                Log.d("getTouristSpotWeatherUseCaseReuslt", it.response.toString())
            }.onError {

            }
        }
    }
}