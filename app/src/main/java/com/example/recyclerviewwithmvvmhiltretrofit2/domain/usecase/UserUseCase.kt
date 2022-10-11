package com.example.recyclerviewwithmvvmhiltretrofit2.domain.usecase

import com.example.recyclerviewwithmvvmhiltretrofit2.data.source.ReqresService
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.translator.UserTranslator.toUserModelList
import javax.inject.Inject

class UserUseCase @Inject constructor(
    private val reqresService: ReqresService
){
    suspend fun getUserList(page: Int): List<UserModel> {
        val data = reqresService.getUserList(page).body()?.data
        return data?.toUserModelList() ?: listOf()
    }
}