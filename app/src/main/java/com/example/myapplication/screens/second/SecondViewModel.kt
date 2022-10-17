package com.example.myapplication.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repasitory.Repository
import com.example.myapplication.models.nonal.NoNalModel
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<NoNalModel>> = MutableLiveData()

    fun getNoNalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getNoNal()
        }
    }

}