package kr.lion.meebee.ui.village_forecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kr.lion.meebee.R
import kr.lion.meebee.ui.SharedViewModelFactory
import kr.lion.meebee.ui.village_forecast.vm.VillageForecastViewModel

class VillageForeCastActivity : AppCompatActivity() {
    private val viewModel: VillageForecastViewModel by viewModels { SharedViewModelFactory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_village_forecast)
        viewModel
    }
}