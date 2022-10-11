package com.example.recyclerviewwithmvvmhiltretrofit2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewwithmvvmhiltretrofit2.R
import com.example.recyclerviewwithmvvmhiltretrofit2.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter = UserAdapter()
        binding.recyclerviewUserList.adapter = adapter

        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter: UserAdapter) {
        viewModel.userList.observe(this) { userList ->
            adapter.submitList(userList)
        }
    }
}