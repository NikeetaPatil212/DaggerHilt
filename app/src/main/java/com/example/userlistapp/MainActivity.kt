package com.example.userlistapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userlistapp.adapter.UserAdapter
import com.example.userlistapp.api.Resource
import com.example.userlistapp.databinding.ActivityMainBinding
import com.example.userlistapp.model.GetUserList
import com.example.userlistapp.pojo.UserDetails
import com.example.userlistapp.viewModel.UserListViewModel
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

   // var userDetail = ArrayList<UserDetails>()
    lateinit var adapter: UserAdapter
    lateinit var binding: ActivityMainBinding

    private val userListViewModel : UserListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setObserver()
        setAdapter()
        userListViewModel.fetchDetails()
    }

    @SuppressLint("NewApi")
    private fun setAdapter() {

        adapter = UserAdapter(this)
        binding.userRecyclerView.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
        )
        binding.userRecyclerView.adapter = adapter
    }
    private fun setObserver(){
        userListViewModel.userDetailLiveData.observe(this, Observer {
            adapter.setUserAdapter(it)
        })
    }
}