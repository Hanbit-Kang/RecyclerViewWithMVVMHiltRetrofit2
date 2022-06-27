package com.example.recyclerviewwithmvvmhiltretrofit2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewwithmvvmhiltretrofit2.data.User
import com.example.recyclerviewwithmvvmhiltretrofit2.useCase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject internal constructor(
    private val userUseCase: UserUseCase
): ViewModel() {
    val userList: MutableLiveData<List<User>> = MutableLiveData()
    init {
        updateUserList()
    }

    fun updateUserList() {
        GlobalScope.launch {
            userList.postValue(userUseCase.getUserList(1))
        }
    }
}