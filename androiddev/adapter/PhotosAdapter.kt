package com.example.androiddev.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddev.API.PhotosResponse
import com.example.androiddev.R

class PhotosAdapter(private val list: ArrayList<PhotosResponse>) : RecyclerView.Adapter<PhotosAdapter.MyViewHolder>() {

    inner class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(photosResponse: PhotosResponse){

            val tvText = itemView.findViewById<TextView>(R.id.tvtext)

            with(itemView){
                val text = "Id : ${photosResponse.id} \n" +
                        "Title : ${photosResponse.title} \n" +
                        "Url : ${photosResponse.url} \n" +
                        "Thumbnail : ${photosResponse.thumbnailUrl}"

                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photos, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}