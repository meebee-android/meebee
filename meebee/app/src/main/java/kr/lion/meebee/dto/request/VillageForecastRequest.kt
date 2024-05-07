package kr.lion.meebee.dto.request

data class VillageForecastRequest (
    val serviceKey: String,
    val pageNo: Int,
    val numOfRows: Int,
    val dataType: String,
    val baseDate: String,
    val baseTime: String,
    val nx: String,
    val ny: String
)

fun VillageForecastRequest.toMap(): Map<String, String> {
    return mapOf(
        "ServiceKey" to serviceKey,
        "pageNo" to pageNo.toString(),
        "numOfRows" to numOfRows.toString(),
        "dataType" to dataType,
        "base_date" to baseDate,
        "base_time" to baseTime,
        "nx" to nx,
        "ny" to ny
    )
}