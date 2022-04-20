package com.example.userlistapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.userlistapp.R
import com.example.userlistapp.databinding.ItemUserListBinding
import com.example.userlistapp.pojo.UserDetails

class UserAdapter( private var context : Context
   // private var userList: ArrayList<UserDetails>
) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {


    private lateinit var binding: ItemUserListBinding

    var userList = mutableListOf<UserDetails>()
    fun setUserAdapter(userList: List<UserDetails>) {
        this.userList = userList.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        binding = ItemUserListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position],context)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    inner class ViewHolder(var binding: ItemUserListBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindItems(userDetails: UserDetails,context : Context) {
            binding.userDeatilsPojo = userDetails

            binding.txtUserId.text = userDetails.id
            binding.txtName.text = userDetails.name
            binding.txtEmail.text = userDetails.email
            Glide.with(context)
                .load(userDetails.avatar)
                .placeholder(R.drawable.dummy_avatar)
                .error(R.drawable.dummy_avatar)
                .into(binding.imgAvatar)

        }
    }
}