package com.example.androiddev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddev.API.UsersResponse
import com.example.androiddev.R

class UsersAdapter(private val list: ArrayList<UsersResponse>) : RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val tv_response = itemView.findViewById<TextView>(R.id.tv_response)

        fun bind(usersResponseItem: UsersResponse){
            with(itemView){
                val text = "id : ${usersResponseItem.id} \n" +
                        "name : ${usersResponseItem.name} \n" +
                        "email : ${usersResponseItem.email} \n" +
                        "phone : ${usersResponseItem.phone} \n" +
                        "street : ${usersResponseItem.street} \n" +
                        "suite : ${usersResponseItem.suite} \n" +
                        "city : ${usersResponseItem.city} \n" +
                        "nameCompany : ${usersResponseItem.nameCompany} \n" +
                        "catchPharase : ${usersResponseItem.catchPhrase} \n" +
                        "bs : ${usersResponseItem.bs} \n" +
                        "lng : ${usersResponseItem.lng} \n" +
                        "lat : ${usersResponseItem.lat}"

                tv_response.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_users, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}