package com.example.myrifa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myrifa.databinding.ItemRifaBinding
import com.example.myrifa.domain.model.User

class RifaAdapter: ListAdapter<User, RifaAdapter.RifaViewHolder>(DIFF_CALLBACK) {

    class RifaViewHolder(
        private val itemUserBinding: ItemRifaBinding
    ): RecyclerView.ViewHolder(itemUserBinding.root) {

        fun bind(user: User) {
            itemUserBinding.run {
                /*Glide.with(itemView)
                    .load(user.img)
                    .fitCenter()
                    .into(picture)
                name.text = user.name
                username.text = user.username*/

            }
        }

        companion object {
            fun create(parent: ViewGroup): RifaViewHolder {
                val itemBinding = ItemRifaBinding
                    .inflate(LayoutInflater.from(parent.context), parent, false)

                return RifaViewHolder(itemBinding)
            }

        }
    }
    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<User>() {
            override fun areItemsTheSame(
                oldItem: User,
                newItem: User
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: User,
                newItem: User
            ): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RifaViewHolder {
        return RifaViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RifaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}