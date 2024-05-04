package kr.lion.meebee.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import co.kr.lion.meebee.usecase.GetVillageForecastUseCase
import kr.lion.meebee.Constant
import kr.lion.meebee.datasource.village_forecast.LocalVillageForecastDataSource
import kr.lion.meebee.datasource.village_forecast.RemoteVillageForecastDataSource
import kr.lion.meebee.network.RetrofitInstance
import kr.lion.meebee.network.service.VillageForecastService
import kr.lion.meebee.repository.village_forecast.VillageForecastRepositoryImpl
import kr.lion.meebee.ui.village_forecast.vm.VillageForecastViewModel

val WeatherViewModelFactory = object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =

        with(modelClass){
            val getTouristSpotWeatherUseCase =
                GetVillageForecastUseCase(
                    VillageForecastRepositoryImpl(
                        RemoteVillageForecastDataSource(
                            RetrofitInstance.provideService(
                                Constant.VILLAGE_FORECAST_BASE_URL,
                                VillageForecastService::class.java
                            )
                        ),
                        LocalVillageForecastDataSource()
                    )
                )

            when{
                isAssignableFrom(VillageForecastViewModel::class.java) ->
                    VillageForecastViewModel(getTouristSpotWeatherUseCase)

                else -> throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
            }
    } as T
}