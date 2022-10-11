package com.example.recyclerviewwithmvvmhiltretrofit2.ui

import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithmvvmhiltretrofit2.domain.model.UserModel
import com.google.android.material.composethemeadapter.MdcTheme

class UserAdapter : ListAdapter<UserModel, RecyclerView.ViewHolder>(UserModelDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(ComposeView(parent.context))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = getItem(position)
        (holder as UserViewHolder).bind(user)
    }

    class UserViewHolder(
        composeView: ComposeView
    ) : RecyclerView.ViewHolder(composeView) {
        fun bind(userModel: UserModel) {
            (itemView as ComposeView).setContent {
                MdcTheme {
                    UserItemView(userModel)
                }
            }
        }
    }
}

private class UserModelDiffCallback : DiffUtil.ItemCallback<UserModel>() {
    override fun areItemsTheSame(oldItem: UserModel, newItem: UserModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: UserModel, newItem: UserModel): Boolean {
        return oldItem == newItem
    }
}