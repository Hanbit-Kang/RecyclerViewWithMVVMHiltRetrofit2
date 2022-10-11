package com.example.recyclerviewwithmvvmhiltretrofit2.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject internal constructor(
    private val userUseCase: UserUseCase
): ViewModel() {
    val userList: MutableLiveData<List<UserModel>> = MutableLiveData()

    init {
        getUserList()
    }

    fun getUserList() {
        viewModelScope.launch {
            userList.postValue(userUseCase.getUserList(1))
        }
    }
}