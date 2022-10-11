package com.example.recyclerviewwithmvvmhiltretrofit2.data.dto

import com.example.recyclerviewwithmvvmhiltretrofit2.data.entity.Support
import com.example.recyclerviewwithmvvmhiltretrofit2.data.entity.User

data class UserListResponse (
    val page: Int,
    val per_page: Int,
    val total: Int,
    val total_pages: Int,
    val data: List<User>,
    val support: Support
)