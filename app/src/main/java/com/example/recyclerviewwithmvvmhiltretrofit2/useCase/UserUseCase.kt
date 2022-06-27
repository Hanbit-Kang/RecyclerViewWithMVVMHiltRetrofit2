package com.example.recyclerviewwithmvvmhiltretrofit2.useCase

import com.example.recyclerviewwithmvvmhiltretrofit2.data.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

class UserUseCase @Inject constructor(
    private val userRepository: UserRepository
){
    suspend fun getUserList(page: Int) = userRepository.getUserList(page)?.data
}