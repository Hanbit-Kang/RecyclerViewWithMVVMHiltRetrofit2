package com.example.recyclerviewwithmvvmhiltretrofit2.data.repository

import com.example.recyclerviewwithmvvmhiltretrofit2.data.entity.User
import com.example.recyclerviewwithmvvmhiltretrofit2.data.source.ReqresService
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val reqresService: ReqresService,
) {
    suspend fun getUserList(page: Int): List<User> {
        return reqresService.getUserList(page).data
    }
}