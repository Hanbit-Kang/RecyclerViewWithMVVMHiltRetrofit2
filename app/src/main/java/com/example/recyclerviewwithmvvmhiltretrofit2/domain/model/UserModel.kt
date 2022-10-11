package com.example.recyclerviewwithmvvmhiltretrofit2.domain.model


/**
 * A data class whose fileds are modified by [UserTranslator] for use in views.
 */
data class UserModel(
    val id: Int,
    val email: String,
    val name: String,
    val avatar: String
)