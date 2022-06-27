package com.example.recyclerviewwithmvvmhiltretrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewwithmvvmhiltretrofit2.adapter.UserAdapter
import com.example.recyclerviewwithmvvmhiltretrofit2.databinding.ActivityMainBinding
import com.example.recyclerviewwithmvvmhiltretrofit2.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter = UserAdapter()
        binding.recyclerviewUserlist.adapter = adapter
        subscribeUi(adapter)
    }

    private fun subscribeUi(adapter: UserAdapter) {
        viewModel.userList.observe(this) { userList ->
            adapter.submitList(userList)
        }
    }
}