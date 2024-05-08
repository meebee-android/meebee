package kr.lion.meebee.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kr.lion.meebee.usecase.GetVillageForecastUseCase
import kr.lion.meebee.repository.village_forecast.VillageForecastRepository
import kr.lion.meebee.ui.village_forecast.vm.VillageForecastViewModel

val SharedViewModelFactory = object : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =

        with(modelClass){
            val getVillageForecastUseCase = GetVillageForecastUseCase(VillageForecastRepository.create())

            when{
                isAssignableFrom(VillageForecastViewModel::class.java) ->
                    VillageForecastViewModel(getVillageForecastUseCase)

                else -> throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
            }
    } as T
}