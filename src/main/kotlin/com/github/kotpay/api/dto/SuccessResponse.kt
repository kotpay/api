package com.github.kotpay.api.dto

data class SuccessResponse<T>(private val data: T) : Response<T> {
    override fun getSuccess(): Boolean = true
    override fun getData(): T = data
}