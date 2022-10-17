package com.example.myapplication.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repasitory.Repository
import com.example.myapplication.models.nal.NalModel
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<NalModel>> = MutableLiveData()

    fun getNalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }


}