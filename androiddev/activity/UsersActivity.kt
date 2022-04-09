package com.example.androiddev.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddev.API.RetrofitClientUsers
import com.example.androiddev.API.UsersResponse
import com.example.androiddev.R
import com.example.androiddev.adapter.UsersAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UsersActivity : AppCompatActivity() {

    private var list = ArrayList<UsersResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)

        val tvResponseCode = findViewById<TextView>(R.id.tv_responseCode)
        val rvUsers = findViewById<RecyclerView>(R.id.rv_users)

        rvUsers.setHasFixedSize(true)
        rvUsers.layoutManager = LinearLayoutManager(this)

        RetrofitClientUsers.instance.getUsers().enqueue(object : Callback<ArrayList<UsersResponse>> {
            override fun onResponse(
                call: Call<ArrayList<UsersResponse>>,
                response: Response<ArrayList<UsersResponse>>,
            ) {
                val responseCode = response.code().toString()
                tvResponseCode.text = responseCode

                response.body()?.let { list.addAll(it) }
                val adapter = UsersAdapter(list)
                rvUsers.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<UsersResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}