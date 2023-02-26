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

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding?>(this, R.layout.activity_main).also {
            it.lifecycleOwner = this
            it.viewModel = viewModel
            it.adapter = UserAdapter()
        }
    }
}