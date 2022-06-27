package com.example.recyclerviewwithmvvmhiltretrofit2.api

import com.example.recyclerviewwithmvvmhiltretrofit2.data.UserListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ReqresApi {
    @GET("api/users")
    fun getUserList(@Query("page") page: Int): Response<UserListResponse>
}