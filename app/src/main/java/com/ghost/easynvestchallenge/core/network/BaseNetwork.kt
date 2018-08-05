package com.ghost.easynvestchallenge.core.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

abstract class BaseNetwork {

    private val baseHost = "https://api-simulator-calc.easynvest.com.br/"

    protected fun getRetrofitBuilder(baseUrl: String = baseHost): Retrofit.Builder {

        val gsonBuilder = getGsonBuilder()

        val retrofitBuilder = Retrofit.Builder()

        with(retrofitBuilder) {
            baseUrl(baseUrl)
            addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        }

        return retrofitBuilder

    }

    private fun getGsonBuilder(): GsonBuilder = GsonBuilder()

}