package co.kr.lion.meebee.usecase.base

sealed class Result<out T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Error<T>(val error: Throwable) : Result<T>()
}