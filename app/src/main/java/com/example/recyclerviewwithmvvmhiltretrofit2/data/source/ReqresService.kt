package com.example.recyclerviewwithmvvmhiltretrofit2.data.source

import com.example.recyclerviewwithmvvmhiltretrofit2.data.dto.UserListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ReqresService {
    @GET("api/users")
    suspend fun getUserList(@Query("page") page: Int): UserListResponse
}