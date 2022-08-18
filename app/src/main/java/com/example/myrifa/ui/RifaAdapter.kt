package com.example.myrifa.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myrifa.databinding.ItemRifaBinding
import com.example.myrifa.domain.model.User

class RifaAdapter: ListAdapter<User, RifaAdapter.UsersViewHolder>(DIFF_CALLBACK) {

    class RifaViewHolder(
        private val itemUserBinding: ItemRifaBinding
    ): RecyclerView.ViewHolder(itemUserBinding.root){

        fun bind(user: User){
            itemUserBinding.run {
                /*Glide.with(itemView)
                    .load(user.img)
                    .fitCenter()
                    .into(picture)
                name.text = user.name
                username.text = user.username*/

            }
        }
        companion object{
            fun create(parent: ViewGroup): UsersViewHolder {
                val itemBinding = ListItemUserBinding
                    .inflate(LayoutInflater.from(parent.context), parent, false)

                return UsersViewHolder(itemBinding)
            }
        }

    }
}