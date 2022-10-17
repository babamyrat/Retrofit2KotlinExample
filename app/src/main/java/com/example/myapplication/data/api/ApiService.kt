package com.example.myapplication.data.api

import com.example.myapplication.models.nal.NalModel
import com.example.myapplication.models.nonal.NoNalModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("757ec4557b4a94c65636") //endpoint
    suspend fun getNalMoney(): Response<NalModel>

    @GET("757ec4557b4a94c65636") //endpoint
    suspend fun getNoNalMoney(): Response<NoNalModel>

    //https://api.npoint.io/757ec4557b4a94c65636
}