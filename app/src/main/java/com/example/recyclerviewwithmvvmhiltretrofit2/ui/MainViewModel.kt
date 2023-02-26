package com.example.recyclerviewwithmvvmhiltretrofit2.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.usecase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject internal constructor(
    private val userUseCase: UserUseCase
): ViewModel() {
    private val _userList = MutableStateFlow<List<UserModel>>(listOf())
    val userList: StateFlow<List<UserModel>> = _userList

    init {
        readUserList()
    }

    fun readUserList() {
        viewModelScope.launch {
            _userList.value = userUseCase.getUserList(1)
        }
    }
}