package com.github.kotpay.api.dto

interface Response<T> {
    fun getSuccess(): Boolean
    fun getData(): T? = null
    fun getError(): ErrorHolder? = null
}