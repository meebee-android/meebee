package kr.lion.meebee.dto.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kr.lion.meebee.model.VillageForecastResult

@JsonClass(generateAdapter = true)
data class VillageForecastResponse(
    val response: Response
)
@JsonClass(generateAdapter = true)
data class Header(
    val resultCode: String,
    val resultMsg: String
)

@JsonClass(generateAdapter = true)
data class Response(
    val body: Body,
    val header: Header
)

@JsonClass(generateAdapter = true)
data class Items(
    val item: List<Item>
)

@JsonClass(generateAdapter = true)
data class Item(
    val baseDate: String,
    val baseTime: String,
    val category: String,
    val fcstDate: String,
    val fcstTime: String,
    val fcstValue: String,
    val nx: String,
    val ny: String
)

@JsonClass(generateAdapter = true)
data class Body(
    val dataType: String,
    val items: Items,
    val numOfRows: String,
    val pageNo: String,
    val totalCount: String
)

fun VillageForecastResponse.toUiModel(): VillageForecastResult {
    // Ui에서 사용할 형태로 구현 예정
    return VillageForecastResult()
}