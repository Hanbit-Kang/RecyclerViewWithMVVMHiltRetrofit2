package com.example.recyclerviewwithmvvmhiltretrofit2.data

import com.example.recyclerviewwithmvvmhiltretrofit2.api.ReqresApi
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val reqresApi: ReqresApi
){
    fun getUserList(page: Int): UserListResponse? {
        return reqresApi.getUserList(page).body()
    }
}