package com.github.kotpay.api.sample

import com.github.kotpay.api.dto.Response


interface SampleTestApi {
    fun getHello(name: String): Response<String>

    fun getException(): Response<String>

}