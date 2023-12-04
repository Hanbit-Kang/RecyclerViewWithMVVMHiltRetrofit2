package com.example.recyclerviewwithmvvmhiltretrofit2.domain.usecase

import com.example.recyclerviewwithmvvmhiltretrofit2.data.repository.UserRepository
import com.example.recyclerviewwithmvvmhiltretrofit2.data.source.ReqresService
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.translator.UserTranslator.toUserModelList
import javax.inject.Inject

class GetUserListUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(page: Int): List<UserModel> {
        return userRepository.getUserList(page).toUserModelList()
    }
}