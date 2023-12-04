package com.example.recyclerviewwithmvvmhiltretrofit2.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.usecase.GetUserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject internal constructor(
    private val getUserListUseCase: GetUserListUseCase
): ViewModel() {
    private val _userList = MutableStateFlow<List<UserModel>>(listOf())
    val userList: StateFlow<List<UserModel>> = _userList

    init {
        readUserList()
    }

    private fun readUserList() {
        viewModelScope.launch(Dispatchers.IO) {
            _userList.value = getUserListUseCase(1)
        }
    }
}