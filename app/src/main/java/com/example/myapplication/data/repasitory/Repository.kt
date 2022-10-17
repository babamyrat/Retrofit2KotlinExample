package com.example.myapplication.data.repasitory

import com.example.myapplication.data.api.RetrofitInstance
import com.example.myapplication.models.nal.NalModel
import com.example.myapplication.models.nonal.NoNalModel
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<NalModel> {
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getNoNal(): Response<NoNalModel> {
        return RetrofitInstance.api.getNoNalMoney()
    }
}