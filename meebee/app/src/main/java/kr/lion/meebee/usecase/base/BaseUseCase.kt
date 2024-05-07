package kr.lion.meebee.usecase.base

open class BaseUseCase {
    protected inline fun <T> execute(block: () -> T): Result<T> = runCatching {
        Result.Success(block())
    }.getOrElse {
        it.printStackTrace()
        Result.Error(it)
    }
}