package com.example.recyclerviewwithmvvmhiltretrofit2.data

import com.example.recyclerviewwithmvvmhiltretrofit2.data.entity.User
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.translator.UserTranslator.toUserModelList
import org.junit.Assert.assertTrue
import org.junit.Test

class UserTranslatorTest {

    @Test
    fun toUserModelList() {
        val user = User(
            id = 2,
            email = "janet.weaver@reqres.in",
            first_name = "Janet",
            last_name = "Weaver",
            avatar = "https://reqres.in/img/faces/2-image.jpg"
        )
        val userModelList = listOf(user).toUserModelList()
        assertTrue(userModelList[0].name == user.first_name + " " + user.last_name)
    }
}