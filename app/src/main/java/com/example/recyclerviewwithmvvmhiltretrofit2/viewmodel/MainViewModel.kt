package com.example.recyclerviewwithmvvmhiltretrofit2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewwithmvvmhiltretrofit2.useCase.UserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject internal constructor(
    userUseCase: UserUseCase
): ViewModel() {

}