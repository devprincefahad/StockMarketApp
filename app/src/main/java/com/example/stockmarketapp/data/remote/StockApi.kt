package com.example.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String
    ): ResponseBody

    companion object {
        const val API_KEY = "K0PXTC2GBZYWISU3"
        const val BASE_URL = "https://www.alphavantage.co"
    }

}