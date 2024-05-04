package kr.lion.meebee.dto.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kr.lion.meebee.model.VillageForecastResult

@JsonClass(generateAdapter = true)
data class VillageForecastResponse(
    @Json(name = "response")
    val response: Response
){
    fun toUiModel(): VillageForecastResult {
        // Ui에서 사용할 형태로 구현 예정
        return VillageForecastResult()
    }
}

@JsonClass(generateAdapter = true)
data class Header(
    @Json(name = "resultCode")
    val resultCode: String,
    @Json(name = "resultMsg")
    val resultMsg: String
)

@JsonClass(generateAdapter = true)
data class Response(
    @Json(name = "body")
    val body: Body,
    @Json(name = "header")
    val header: Header
)

@JsonClass(generateAdapter = true)
data class Items(
    @Json(name = "item")
    val item: List<Item>
)

@JsonClass(generateAdapter = true)
data class Item(
    @Json(name = "baseDate")
    val baseDate: String,
    @Json(name = "baseTime")
    val baseTime: String,
    @Json(name = "category")
    val category: String,
    @Json(name = "fcstDate")
    val fcstDate: String,
    @Json(name = "fcstTime")
    val fcstTime: String,
    @Json(name = "fcstValue")
    val fcstValue: String,
    @Json(name = "nx")
    val nx: String,
    @Json(name = "ny")
    val ny: String
)

@JsonClass(generateAdapter = true)
data class Body(
    @Json(name = "dataType")
    val dataType: String,
    @Json(name = "items")
    val items: Items,
    @Json(name = "numOfRows")
    val numOfRows: String,
    @Json(name = "pageNo")
    val pageNo: String,
    @Json(name = "totalCount")
    val totalCount: String
)