package com.ziadsyahrul.weatherapp.data

import com.ziadsyahrul.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("data/2.5/weather?&units=metric&APPID=3d64dee424cc945852b708b0762b7863")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}