package com.example.recyclerviewwithmvvmhiltretrofit2.di

import com.example.recyclerviewwithmvvmhiltretrofit2.data.UserRepository
import com.example.recyclerviewwithmvvmhiltretrofit2.useCase.UserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideUserUseCase(userRepository: UserRepository) = UserUseCase(userRepository)
}